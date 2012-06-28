<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Quote</title>
    <link type="text/css" rel="stylesheet" href="${resource(dir: 'css/', file: 'bootstrap.css')}"/>
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
    <script type="text/javascript" src="${resource(dir: 'js/', file: 'bootstrap.min.js')}"></script>
</head>

<body>

<div class="container">
    <div class="navbar">
        <div class="navbar-inner">
            <div class="container">
                ...
            </div>
        </div>
    </div>
    <div class="span8">
        <h2>Client Information</h2>
        <form class="form-horizontal" _lpchecked="1" action="update">
            <input type="hidden" name="next" value="coverages"/>
            <fieldset>
                <div class="control-group">
                    <label class="control-label" for="client.firstName">First Name</label>
                    <div class="controls">
                        <input type="text" class="input-xlarge" id="client.firstName">
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="client.lastName">Last Name</label>
                    <div class="controls">
                        <input type="text" class="input-xlarge" id="client.lastName">
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="client.dateOfBirth">Date of Birth</label>
                    <div class="controls">
                        <joda:datePicker name="client.dateOfBirth" id="client.dateOfBirth"/>
                    </div>
                </div>
                <div class="form-actions">
                    <button type="submit" class="btn btn-primary">Save changes</button>
                    <button class="btn">Cancel</button>
                </div>
            </fieldset>
        </form>
    </div>
</div>
</body>
</html>