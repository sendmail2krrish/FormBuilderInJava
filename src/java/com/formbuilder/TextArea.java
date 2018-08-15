package com.formbuilder;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Krishna Paul
 */
public class TextArea
{

    public static String create(String args) throws JSONException
    {
        JSONObject textarea = new JSONObject(args);
        String output;
        
        output = "<div class=\"form-group\">";
        output += "<label for=\"" + textarea.get("id") + "\">" + textarea.get("title") + "</label>";
        output += "<textarea ";
        output += "id=\"" + textarea.get("id") + "\" ";
        output += "class=\"form-control " + textarea.get("class") + "\" ";
        output += "name=\"" + textarea.get("name") + "\" ";
        if ((boolean)textarea.get("required"))
        {
            output += "required ";
        }
        output += "placeholder=\"" + textarea.get("placeholder") + "\"";
        output += ">" + textarea.get("value");
        output += "</textarea>";
        output += "</div>";
        
        return output;
    }
}
