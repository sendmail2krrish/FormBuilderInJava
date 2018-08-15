# Dynamic Bootstrap form builder

## Form Example 1: 

`
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
`
