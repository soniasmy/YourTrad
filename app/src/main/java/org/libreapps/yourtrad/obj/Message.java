package org.libreapps.yourtrad.obj;

import org.json.JSONObject;

public class Message {

    private final int id;
    private final String containt;

    public Message(JSONObject jObject) {
        this.id = jObject.optInt("id");
        this.containt = jObject.optString("containt");
    }

    public int getId() {
        return id;
    }

    public String getContaint(){
        return containt;
    }
}
