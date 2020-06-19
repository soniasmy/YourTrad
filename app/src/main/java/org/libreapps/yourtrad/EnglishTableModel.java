package org.libreapps.yourtrad;

import org.libreapps.yourtrad.obj.EnglishWord;

import java.util.ArrayList;

public class EnglishTableModel {

    private String[] columnsNames = {"Id", "Libellé"};
    private ArrayList<EnglishWord> EnglishWordList = new ArrayList<EnglishWord>();
    private ConnectionRest connectionRest = null;

    public EnglishTableModel() {
    }

    public String[] getEnglishWordHeaders() {
        return columnsNames;
    }
}
