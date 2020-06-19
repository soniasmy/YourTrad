package org.libreapps.yourtrad;

import org.libreapps.yourtrad.obj.FrenchWord;

import java.util.ArrayList;

public class FrenchTableModel {

    private String[] columnsNames = {"Id", "Libellé"};
    private ArrayList<FrenchWord> frenchWordList = new ArrayList<FrenchWord>();
    private ConnectionRest connectionRest = null;

    public FrenchTableModel() {
    }

    public String[] getFrenchWordHeaders() {
        return columnsNames;
    }
}
