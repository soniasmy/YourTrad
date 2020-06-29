package org.libreapps.yourtrad;

import org.libreapps.yourtrad.obj.LanguageWord;

import java.util.ArrayList;

public class SpanishTableModel {

    private String[] columnsNames = {"Id", "Libellé"};
    private ArrayList<LanguageWord> frenchWordList = new ArrayList<LanguageWord>();
    private ConnectionRest connectionRest = null;

    public SpanishTableModel() {
    }

    public String[] getSpanishWordHeaders() {
        return columnsNames;
    }
}
