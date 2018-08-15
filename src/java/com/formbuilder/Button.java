package com.formbuilder;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Krishna Paul
 */
public class Button
{
    public static String create(String args) throws JSONException
    {
        JSONObject button = new JSONObject(args);
        return "<button "
                + "id=\"" + button.get("id") + "\" "
                + "class=\"btn " + button.get("class") + "\" "
                + "type=\"" + button.get("type") + "\">"
                + button.get("title")
                + "</button>";
    }
}
