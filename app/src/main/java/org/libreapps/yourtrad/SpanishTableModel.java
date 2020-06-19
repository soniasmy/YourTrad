package org.libreapps.yourtrad;

import org.libreapps.yourtrad.obj.SpanishWord;

import java.util.ArrayList;

public class SpanishTableModel {

    private String[] columnsNames = {"Id", "Libellé"};
    private ArrayList<SpanishWord> frenchWordList = new ArrayList<SpanishWord>();
    private ConnectionRest connectionRest = null;

    public SpanishTableModel() {
    }

    public String[] getSpanishWordHeaders() {
        return columnsNames;
    }
}
