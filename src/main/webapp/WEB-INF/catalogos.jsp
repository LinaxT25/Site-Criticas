<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<% String[] images = new String[255];
    for(int i = 1; i <= (int) request.getAttribute("numberOfImages"); i++) {
        images[i] = (String) request.getAttribute("Image" + i);
    }
%>

<style>
    img {
        content: '';
        position: relative;
        top: -300px;
        margin-top: 5%;
        margin-left: 3%;
        height: 300px;
        width: 200px;
    }
    a {
        text-decoration: none;
    }
</style>

<t:layout>
    <jsp:attribute name="header"></jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:layout>

<html>
    <body>
        <a href="<%request.getContextPath();%>?movie=id1">
            <img src="data:image/png;base64,<%=images[1]%>" onerror="this.style.display='none'">
        </a>
        <a href="<%request.getContextPath();%>?movie=id2">
            <img src="data:image/png;base64,<%=images[2]%>" onerror="this.style.display='none'">
        </a>
        <a href="<%request.getContextPath();%>?movie=id3">
            <img src="data:image/png;base64,<%=images[3]%>" onerror="this.style.display='none'">
        </a>
        <a href="<%request.getContextPath();%>?movie=id4">
            <img src="data:image/png;base64,<%=images[4]%>" onerror="this.style.display='none'">
        </a>
        <a href="<%request.getContextPath();%>?movie=id5">
            <img src="data:image/png;base64,<%=images[5]%>" onerror="this.style.display='none'">
        </a>
        <a href="<%request.getContextPath();%>?movie=id6">
            <img src="data:image/png;base64,<%=images[6]%>" onerror="this.style.display='none'">
        </a>
        <a href="<%request.getContextPath();%>?movie=id7">
            <img src="data:image/png;base64,<%=images[7]%>" onerror="this.style.display='none'">
        </a>
        <a href="<%request.getContextPath();%>?movie=id8">
            <img src="data:image/png;base64,<%=images[8]%>" onerror="this.style.display='none'">
        </a>
        <a href="<%request.getContextPath();%>?movie=id9">
            <img src="data:image/png;base64,<%=images[9]%>" onerror="this.style.display='none'">
        </a>
        <a href="<%request.getContextPath();%>?movie=id10">
            <img src="data:image/png;base64,<%=images[10]%>" onerror="this.style.display='none'">
        </a>
        <a href="<%request.getContextPath();%>?movie=id11">
            <img src="data:image/png;base64,<%=images[11]%>" onerror="this.style.display='none'">
        </a>
        <a href="<%request.getContextPath();%>?movie=id12">
            <img src="data:image/png;base64,<%=images[12]%>" onerror="this.style.display='none'">
        </a>
        <a href="<%request.getContextPath();%>?movie=id13">
            <img src="data:image/png;base64,<%=images[13]%>" onerror="this.style.display='none'">
        </a>
    </body>
</html>










