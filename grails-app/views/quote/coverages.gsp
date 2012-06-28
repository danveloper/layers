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
        <h2>Coverages Available</h2>
        <form class="form-horizontal" _lpchecked="1" action="update">
            <input type="hidden" name="next" value="discounts"/>
            <fieldset>
                <g:each in="${coverages}" var="coverageInstance">
                    <div class="control-group">
                        <label class="control-label" for="coverage-${coverageInstance?.id}">${coverageInstance?.name}</label>
                        <div class="controls">
                            <label class="checkbox">
                                <input type="checkbox" id="coverage-${coverageInstance?.id}" value="${coverageInstance?.id}">
                                Option one is this and that—be sure to include why it's great
                            </label>
                        </div>
                    </div>
                </g:each>
            </fieldset>
        </form>
    </div>
</div>
</body>
</html>