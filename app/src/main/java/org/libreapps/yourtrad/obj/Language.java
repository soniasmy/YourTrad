package org.libreapps.yourtrad.obj;

import org.json.JSONObject;

public class Language {

    private final int id;
    private final String label;

    public Language(JSONObject jObject) {
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
