package org.libreapps.yourtrad;

import org.libreapps.yourtrad.obj.Language;

import java.util.ArrayList;

public class LanguageTableModel {

    private String[] columnsNames = {"Id", "Libellé"};
    private ArrayList<Language> languagesList = new ArrayList<Language>();
    private ConnectionRest connectionRest = null;

    public LanguageTableModel() {
    }

    public String[] getLanguageHeaders() {
        return columnsNames;
    }
}
