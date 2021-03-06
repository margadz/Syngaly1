/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signals.gui;

import java.io.File;
import java.lang.reflect.Method;
import signals.discreteSignals.abstracts.DiscreteSignal;
import signals.tools.SignalSerializationHelper;

/**
 *
 * @author glabg
 */
public class GUIHelper {

    private static final Class HELPERCLASS = GUIHelper.class;

    public static void actionLocator(String action, File file, DiscreteSignal signal) {
        try {
            Method actionMethod = HELPERCLASS.getMethod(action, File.class, DiscreteSignal.class);
            actionMethod.invoke(null, file, signal);
        } catch (Exception ex) {

            //DSAMainWindow.showError(ex, "Błąd Pliku", "Błąd Pliku");
        }
    }

    public static void actionLocator(String action, File file) {
        try {
            Method actionMethod = HELPERCLASS.getMethod(action, File.class);
            actionMethod.invoke(null, file);
        } catch (Exception ex) {
            //DSAMainWindow.showError(ex, "Błąd Pliku", "Błąd Pliku");
        }
    }

    public static void saveSignal(final File file, final DiscreteSignal signal) {
        SignalSerializationHelper.saveSignal(signal, file);
    }

    public static void loadSignal(final File file) {
        MainWindow.GetInstance().addDiscreteSignal(SignalSerializationHelper.loadSignal(file));
    }
}
