/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signals.continuousSignals;

import org.apache.commons.math3.complex.Complex;
import signals.continuousSignals.abstracts.SquareSignals;

/**
 *
 * @author marr
 */
public class TriangleSignal extends SquareSignals {

    public TriangleSignal(double startTime, double amplitude, double duration, double period, int fillFactor) {
        super(startTime, amplitude, duration, period, fillFactor);
        this.fullName = "trójkątny";
    }

    @Override
    protected void generateSignal() {
        this.result = new Complex[numberOfSamples];
        int period = 0;
        int sampleOfPeriod = 0;
        for (int i = 0; i < numberOfSamples; i++) {
            if (i % samplesPerPeriod == 0 && i != 0) {
                period++;
                sampleOfPeriod = 0;
            }
            if (sampleOfPeriod < samplesPerPeriod * fillFactor * 0.01) {
                double tmp = sampleOfPeriod / (samplesPerPeriod * fillFactor * 0.01);
                this.result[i] = new Complex(tmp, 0);
            } else {
                double tmp = (sampleOfPeriod - samplesPerPeriod * fillFactor * 0.01) / (samplesPerPeriod * (100 - fillFactor) * 0.01);
                tmp = (1 - tmp);
                this.result[i] = new Complex(tmp, 0);
            }
            sampleOfPeriod++;
        }
    }
}
