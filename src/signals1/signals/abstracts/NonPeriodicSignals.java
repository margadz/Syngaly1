/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signals1.signals.abstracts;

/**
 *
 * @author marr
 */
public abstract class NonPeriodicSignals extends Signals {

    public NonPeriodicSignals(double startTime, double amplitude, double duration) {
        super(startTime, amplitude, duration);
    }
}
