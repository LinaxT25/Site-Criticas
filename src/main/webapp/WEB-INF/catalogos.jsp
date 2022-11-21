<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<% String Titulo = (String) request.getAttribute("Titulo");%>
<% String Image = (String) request.getAttribute("Image");%>
<t:layout>
    <jsp:attribute name="header"></jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:layout>
<div class="Posters" id="images">
    <h1><%=Titulo%></h1>
<img src="data:image/png;base64,<%=Image%>"/>
</div>

<script>
    /*
    function createImages(count, elementId) {
        println(<%=Image%>)
        // Get the container element where you want to create the images
        var element = document.getElementById("images")
        // Loop count times over to create count image elements
        for (var i = 0 ; i < count ; i++) {

            // Create a new image element
            var imageElement = document.createElement('img')

            // Set the source to index.jpg where index is 0,1,2,3.... count
            imageElement.setAttribute('src', i + ".jpg")

            // Append the new image element to the choosen container.
            element.appendChild(imageElement)
        }
    }
*/
</script>