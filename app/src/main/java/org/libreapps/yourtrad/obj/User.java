package org.libreapps.yourtrad.obj;

import org.json.JSONObject;

public class User {

    private final int id;
    private final String name;
    private final String firstName;
    private final String email;
    private final String password;

    public User(JSONObject jObject) {
        this.id = jObject.optInt("id");
        this.name = jObject.optString("nom");
        this.firstName = jObject.optString("prenom");
        this.email = jObject.optString("email");
        this.password = jObject.optString("password");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
};

