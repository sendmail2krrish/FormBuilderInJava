package com.formbuilder;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Krishna Paul
 */
public class Input
{

    public static String create(String args) throws JSONException
    {
        JSONObject input = new JSONObject(args);
        String output;

        output = "<div class=\"form-group\">";
        output += "<label for=\"" + input.get("id") + "\">" + input.get("title") + "</label>";
        output += "<input ";
        output += "id=\"" + input.get("id") + "\" ";
        output += "class=\"form-control " + input.get("class") + "\" ";
        output += "type=\"" + input.get("type") + "\" ";
        output += "name=\"" + input.get("name") + "\" ";
        if ((boolean)input.get("required"))
        {
            output += "required ";
        }
        output += "value=\"" + input.get("value") + "\"";
        output += "placeholder=\"" + input.get("placeholder") + "\"";
        output += " /></div>";

        return output;
    }
}
