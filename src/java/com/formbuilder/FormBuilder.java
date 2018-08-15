package com.formbuilder;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Krishna Paul
 */
public class FormBuilder
{

    private List<String> elements = new ArrayList<>();

    public FormBuilder action(String form) throws JSONException
    {
        JSONObject element = new JSONObject(form);
        this.elements
                .add("<form "
                        + "id=\"" + element.get("id") + "\" "
                        + "class=\"" + element.get("class") + "\" "
                        + "action=\"" + element.get("action") + "\" "
                        + "method=\"" + element.get("method")
                        + "\">");
        return this;
    }

    public FormBuilder addInput(String input) throws JSONException
    {
        this.elements.add(Input.create(input));
        return this;
    }

    public FormBuilder addSelectBox(String select) throws JSONException
    {
        this.elements.add(SelectBox.create(select));
        return this;
    }
    
    public FormBuilder addCheckBox(String checkbox) throws JSONException
    {
        this.elements.add(CheckBox.create(checkbox));
        return this;
    }
    
    public FormBuilder addRadioButton(String radiobutton) throws JSONException
    {
        this.elements.add(RadioButton.create(radiobutton));
        return this;
    }

    public FormBuilder addTextArea(String textarea) throws JSONException
    {
        this.elements.add(TextArea.create(textarea));
        return this;
    }

    public FormBuilder addButton(String button) throws JSONException
    {
        this.elements.add(Button.create(button));
        return this;
    }

    public String render()
    {
        String form = "";

        for (String element : this.elements)
        {
            form = form + element;
        }
        form += "<form>";
        this.elements.clear();
        return form;
    }
}
