<%@ page import="java.io.PrintWriter" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
    <jsp:attribute name="header"></jsp:attribute>
    <jsp:body>
        <style>
            .layout {
                position: relative;
                min-width: 1024px;
                max-width: 1920px;
                height: 50px;
                top: -305px;
                background: url(resources/images/layout.png);
                background-repeat:no-repeat;
                background-size:cover;
            }
        </style>
        <div class="layout"></div>
    </jsp:body>
</t:layout>
<% String message = (String)request.getAttribute("alertMsg");%>
<script>
    var msg = "<%=message%>";
    if(Object.entries(msg).length > 4) {
        alert(msg);
    }
</script>