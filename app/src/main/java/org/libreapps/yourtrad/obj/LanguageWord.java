package org.libreapps.yourtrad.obj;

import org.json.JSONObject;

public class LanguageWord {

    private final int id;
    private final int languageId;
    private final String label;

    public LanguageWord(JSONObject jObject) {
        this.id = jObject.optInt("id");
        this.languageId = jObject.optInt("languageId");
        this.label = jObject.optString("label");
    }

    public int getId() {
        return id;
    }

    public int getLanguageId() {
        return languageId;
    }

    public String getLabel() {
        return label;
    }
}
