/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signals1.signals.abstracts;

import org.apache.commons.math3.complex.Complex;
import signals1.stats.SignalStats;


/**
 *
 * @author marr
 */
public abstract class Signals {
    
    protected double amplitude;
    protected int duration;
    protected int numberOfSamples;
    protected Complex[]result;
    protected double startTime;
    protected SignalStats stats;
    
    public Signals(double startTime, int numberOfSamples, double amplitude, int duration){
        this.startTime = startTime; 
        this.amplitude = amplitude;
        this.duration = duration;
        this.numberOfSamples = numberOfSamples;
    }

    public Complex[] getSignal(){
        if (result == null){
            return generateSignal();
        }
        else{
            return result;
        }
    }
    
    public SignalStats getStats(){
        if (this.stats == null){
            return calculateStats();
        }
        else return this.stats;
    }
    
    public double getAmplitude() {
        return amplitude;
    }

    public double getTimeSpan() {
        return duration;
    }

    public int getNumberOfSamples() {
        return numberOfSamples;
    }
    
    abstract protected Complex[] generateSignal();
    
    abstract protected SignalStats calculateStats();
}
