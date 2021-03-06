/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signals.gui.tables;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import signals.continuousSignals.abstracts.PeriodicSignals;
import signals.continuousSignals.abstracts.AbstractSignal;
import signals.continuousSignals.abstracts.SquareSignals;
import signals.tools.SignalContainer;

/**
 *
 * @author marr
 */
public class VirtualSignalsTableModel extends DefaultTableModel {

    private final String[] columnsNames = {"id", "typ sygnału", "czas początkowy [s]", "czas trwania [s]", "amplituda", "okres [s]", "wypełnienie [%]"};
    private SignalContainer container = SignalContainer.getInstance();
    private int rowsNumber = 0;

    public VirtualSignalsTableModel() {
        addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                rowsNumber = container.size();
            }
        });
    }

    @Override
    public int getRowCount() {
        return rowsNumber;
    }

    @Override
    public int getColumnCount() {
        return columnsNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnsNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AbstractSignal signal = container.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return signal.getId();
            case 1:
                return signal.getFullName();
            case 2:
                return signal.getStartTime();
            case 3:
                return signal.getDuration();
            case 4:
                return signal.getAmplitude();
            case 5:
                return getPeriod(signal);
            case 6:
                return getFill(signal);
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    private Object getPeriod(AbstractSignal signal) {
        if (signal instanceof PeriodicSignals) {
            return ((PeriodicSignals) signal).getPeriod();
        }
        return null;
    }

    private Object getFill(AbstractSignal signal) {
        if (signal instanceof SquareSignals) {
            return ((SquareSignals) signal).getFillFactor();
        }
        return null;
    }
}
