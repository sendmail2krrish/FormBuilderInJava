package com.formbuilder;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Krishna Paul
 */
public class RadioButton
{
    public static String create(String args) throws JSONException
    {
        JSONObject radiobuttons = new JSONObject(args);
        JSONObject items = new JSONObject(radiobuttons.optString("items"));
        String output;
        
        output = "<div class=\"form-group\">";
        for(int i=0; i<items.names().length(); i++)
        {
            String item = items.optString(items.names().getString(i));
            JSONObject radiobutton = new JSONObject(item);
            
            if ((boolean)radiobuttons.get("inline"))
            {
                output += "<div class=\"form-check-inline\">";
            }
            else 
            {
                output += "<div class=\"form-check\">";
            }
            output += "<label class=\"form-check-label\">";
            output += "<input type=\"radio\" class=\"form-check-input\" ";
            output += "name=\"" + radiobuttons.get("name") + "\" ";
            output += "value=\"" + radiobutton.get("value") + "\">";
            output += radiobutton.get("title");
            output += "</label>";
            output += "</div>";
        }
        output += "</div>";
        
        return output;
    }
}
