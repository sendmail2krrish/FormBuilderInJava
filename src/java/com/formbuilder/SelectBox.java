package com.formbuilder;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Krishna Paul
 */
public class SelectBox
{
    public static String create(String args) throws JSONException
    {
        JSONObject select = new JSONObject(args);
        String output;
        String options = (String)select.get("values");
        
        output = "<div class=\"form-group\">";
        output += "<label for=\"" + select.get("id") + "\">" + select.get("title") + "</label>";
        output += "<select ";
        output += "id=\"" + select.get("id") + "\" ";
        output += "class=\"form-control " + select.get("class") + "\" ";
        output += "name=\"" + select.get("name") + "\" ";
        if ((boolean)select.get("required"))
        {
            output += "required ";
        }
        if ((boolean)select.get("multiple"))
        {
            output += "multiple ";
        }
        output += ">";
        
        for(String option : options.split(",", 0))
        {
            output += "<option>" + option + "</option>";
        }
        output += "</select>";
        output += "</div>";
        
        
        return output;
    }
}
