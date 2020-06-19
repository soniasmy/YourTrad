package org.libreapps.yourtrad;

import org.libreapps.yourtrad.obj.Message;

import java.util.ArrayList;

public class MessageTableModel {

    private String[] columnsNames = {"Id", "Contenu"};
    private ArrayList<Message> messagesList = new ArrayList<Message>();
    private ConnectionRest connectionRest = null;

    public MessageTableModel() {
    }

    public String[] getMessageHeaders() {
        return columnsNames;
    }
}
