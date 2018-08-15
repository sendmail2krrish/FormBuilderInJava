package com.formbuilder;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Krishna Paul
 */
public class CheckBox
{
    public static String create(String args) throws JSONException
    {
        JSONObject checkboxs = new JSONObject(args);
        JSONObject items = new JSONObject(checkboxs.optString("items"));
        String output;
        
        output = "<div class=\"form-group\">";
        for(int i=0; i<items.names().length(); i++)
        {
            String item = items.optString(items.names().getString(i));
            JSONObject checkbox = new JSONObject(item);
            
            if ((boolean)checkboxs.get("inline"))
            {
                output += "<div class=\"form-check-inline\">";
            }
            else 
            {
                output += "<div class=\"form-check\">";
            }
            output += "<label class=\"form-check-label\">";
            output += "<input type=\"checkbox\" class=\"form-check-input\" ";
            output += "name=\"" + checkbox.get("name") + "\" ";
            output += "value=\"" + checkbox.get("value") + "\">";
            output += checkbox.get("title");
            output += "</label>";
            output += "</div>";
        }
        output += "</div>";
        
        return output;
    }
}
