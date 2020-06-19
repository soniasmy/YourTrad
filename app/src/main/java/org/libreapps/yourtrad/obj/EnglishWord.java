package org.libreapps.yourtrad.obj;

import org.json.JSONObject;

public class EnglishWord {

    private final int id;
    private final String label;

    public EnglishWord(JSONObject jObject) {
        this.id = jObject.optInt("id");
        this.label = jObject.optString("label");
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }
}
