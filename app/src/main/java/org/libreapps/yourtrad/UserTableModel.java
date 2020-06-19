package org.libreapps.yourtrad;

import org.libreapps.yourtrad.obj.User;

import java.util.ArrayList;

public class UserTableModel {
    private String[] columnsNames = {"Id", "Nom", "Prenom", "Email", "Password"};

    private ArrayList<User> listUsers = new ArrayList<User>();
    private ConnectionRest connectionRest = null;

    public UserTableModel() {
    }

    public String[] getUserHeaders() {
        return columnsNames;
    }

}
