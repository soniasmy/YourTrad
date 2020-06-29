package org.libreapps.yourtrad;

import org.libreapps.yourtrad.obj.LanguageWord;

import java.util.ArrayList;

public class EnglishTableModel {

    private String[] columnsNames = {"Id", "Libellé"};
    private ArrayList<LanguageWord> EnglishWordList = new ArrayList<LanguageWord>();
    private ConnectionRest connectionRest = null;

    public EnglishTableModel() {
    }

    public String[] getEnglishWordHeaders() {
        return columnsNames;
    }
}
