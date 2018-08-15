<%@page import="com.formbuilder.FormBuilder" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Dynamic Bootstrap form builder</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    </head>
    <body>

        <div class="container">
            <h2 style="margin-top: 30px;">Form Example 1</h2>
            <hr>
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
            <br>
            <br>
            <br>
            <hr>
            <br>
            <br>
            <br>
            <h2>From Example 2</h2>
            <hr>
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
        </div>

    </body>
</html>

