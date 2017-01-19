/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signals1.radar;

import org.apache.commons.math3.complex.Complex;
import signals1.discreteSignals.DerivedSignal;
import signals1.operations.Correlation;
import signals1.tools.RadarParameters;

/**
 *
 * @author marr
 */
public class RadarSimulator {

    private final RadarParameters params;
    private RadarSignalsGenerator signals;
    
    public RadarSimulator (RadarParameters params){
        this.params = params;
        signals = new RadarSignalsGenerator(params);
    }
    
    public RadarResponse generateResponse (double distance, double velocity){
        DerivedSignal probingSignal = signals.getProbingSignal();
        DerivedSignal responseSignal1 = signals.getResponseSignal(((distance * 2)/ params.getWaveSpeed()));
        DerivedSignal responseSignal2 = signals.getResponseSignal((((distance * 2) + (params.getInterval() * velocity)) / params.getWaveSpeed()));        
        return new RadarResponse(probingSignal, responseSignal1, responseSignal2, distance, velocity, velocity);
    }
    
    public RadarResponseAnalysis ProcessRadarResponse (RadarResponse response){
        DerivedSignal correlation1 = Correlation.CalculateCorrelation(response.getProbingSignal(), response.getFirstResponse());
        DerivedSignal correlation2= Correlation.CalculateCorrelation(response.getProbingSignal(), response.getSecondRespone());
        double initialDistance = CalculateDistance(correlation1);
        double finalDistance = CalculateDistance(correlation2);
        return new RadarResponseAnalysis(correlation1, correlation2, (Math.abs(initialDistance -  finalDistance) / params.getInterval()), initialDistance, finalDistance);
    }
    
    private double CalculateDistance(DerivedSignal correlation){
        Complex[] values = correlation.getValues();
        int middle = values.length / 2;
        int shift = 0;
        double max = 0;
        for (int i = middle; i < values.length; i++){
            double tmp = values[i].getReal();
            if (tmp >= max){
                max = tmp;
                shift = i;
            }
        }
        return ((shift - middle) * 1.0 /  params.getSamplingRate()) *  params.getWaveSpeed() / 2;
    }
}
