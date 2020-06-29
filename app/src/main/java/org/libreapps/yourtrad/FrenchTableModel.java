package org.libreapps.yourtrad;

import org.libreapps.yourtrad.obj.LanguageWord;

import java.util.ArrayList;

public class FrenchTableModel {

    private String[] columnsNames = {"Id", "Libellé"};
    private ArrayList<LanguageWord> frenchWordList = new ArrayList<LanguageWord>();
    private ConnectionRest connectionRest = null;

    public FrenchTableModel() {
    }

    public String[] getFrenchWordHeaders() {
        return columnsNames;
    }
}
