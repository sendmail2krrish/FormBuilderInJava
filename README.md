# Bootstrap form builder

## Form Example 1: 

<pre>
<%
  FormBuilder fbuilder = new FormBuilder();
%>
<%=
  fbuilder.action("{'id': '', 'class': '', 'action': '', 'method': 'POST'}")
          .addInput("{'id': '', 'class': '', 'type': 'text',  'name': 'fname', 'required': true, 'value': '', 'title': 'First Name:', 'placeholder': 'Enter your first name'}")
          .addInput("{'id': '', 'class': '', 'type': 'text',  'name': 'lname', 'required': true, 'value': '', 'title': 'Last Name:', 'placeholder': 'Enter your last name'}")
          .addSelectBox("{'id': '', 'class': '', 'name': 'subject', 'required': true, 'values': 'English,Math,Programming', 'title': 'Subject:', 'multiple': false}")
          .addCheckBox("{'inline': false, 'items':{0: {'name': 'option1', 'title': 'Option 1', 'value': 'opt1'}, 1: {'name': 'option2', 'title': 'Option 2','value': 'opt2'}}}")
          .addRadioButton("{'inline': false, 'name': 'option1', 'items':{0: {'title': 'Option 1', 'value': 'opt1'}, 1: {'title': 'Option 2','value': 'opt2'}}}")
          .addTextArea("{'id': '', 'class': '', 'name': 'about', 'required': false, 'value': '', 'title': 'About:', 'placeholder': 'Enter about yourself'}")
          .addCheckBox("{'inline': true, 'items':{0: {'name': 'option12', 'title': 'Option 1', 'value': 'opt1'}, 1: {'name': 'option21', 'title': 'Option 2','value': 'opt2'}}}")
          .addRadioButton("{'inline': true, 'name': 'option1', 'items':{0: {'title': 'Option 1', 'value': 'opt1'}, 1: {'title': 'Option 2','value': 'opt2'}}}")
          .addButton("{'id': '', 'class': 'btn-secondary', 'type': 'reset', 'title': 'Reset'}")
          .addButton("{'id': '', 'class': 'btn-primary', 'type': 'submit', 'title': 'Submit'}")
          .render()
%>
</pre>

## Form Example 1: 

<pre>
<form method="POST" action="">
    <h4>Inputs</h4>
    <%= 
        fbuilder.addInput("{'id': '', 'class': '', 'type': 'text',  'name': 'fname', 'required': true, 'value': '', 'title': 'First Name:', 'placeholder': 'Enter your first name'}")
                .render() 
    %>
    <%= 
        fbuilder.addInput("{'id': '', 'class': '', 'type': 'text',  'name': 'lname', 'required': true, 'value': '', 'title': 'Last Name:', 'placeholder': 'Enter your last name'}")
                .render() 
    %>
    <br>
    <h4>Select box</h4>
    <%= 
        fbuilder.addSelectBox("{'id': '', 'class': '', 'name': 'subject', 'required': true, 'values': 'English,Math,Programming', 'title': 'Subject:', 'multiple': false}")
                .render() 
    %>
    <br>
    <h4>Check box</h4>
    <%= 
        fbuilder.addCheckBox("{'inline': false, 'items':{0: {'name': 'option1', 'title': 'Option 1', 'value': 'opt1'}, 1: {'name': 'option2', 'title': 'Option 2','value': 'opt2'}}}")
                .addCheckBox("{'inline': true, 'items':{0: {'name': 'option12', 'title': 'Option 1', 'value': 'opt1'}, 1: {'name': 'option21', 'title': 'Option 2','value': 'opt2'}}}")
                .render() 
    %>
    <br>
    <h4>Radio button</h4>
    <%= 
        fbuilder.addRadioButton("{'inline': false, 'name': 'option1', 'items':{0: {'title': 'Option 1', 'value': 'opt1'}, 1: {'title': 'Option 2','value': 'opt2'}}}")
                .addRadioButton("{'inline': true, 'name': 'option1', 'items':{0: {'title': 'Option 1', 'value': 'opt1'}, 1: {'title': 'Option 2','value': 'opt2'}}}")
                .render() 
    %>
    <br>
    <h4>Button</h4>
    <div class="btn-group">
        <%= 
            fbuilder.addButton("{'id': '', 'class': 'btn-secondary', 'type': 'reset', 'title': 'Reset'}")
                    .addButton("{'id': '', 'class': 'btn-primary', 'type': 'submit', 'title': 'Submit'}")
                    .render() 
        %>
    </div>
</form>
</pre>


Thanks \
Krishna Paul <sendmail2krrish@gmail.com>
