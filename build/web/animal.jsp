<%-- 
    Document   : animals
    Created on : 8 août 2023, 09 h 48 min 59 s
    Author     : isi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Lab.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <header>
<!--            <nav>
                <ul>
                    <li><a href="animal.jsp?nom = chien">chien</a></li>
                    <li><a href="animal.jsp?nom = chat">chat</a></li>
                    <li><a href="animal.jsp?nom = meduse">meduse</a></li>
                    <li><a href="animal.jsp?nom = insect">insecte</a></li>
                </ul>
            </nav>-->
        </header>
        
        <!--<main>-->
            <section>
                    <div>
                        <h3><%=request.getParameter("nom")%></h3>
                        <img src="img/<%=request.getParameter("param")%>.jpg" alt="alt"/>
                        <a href="animals">Retour</a>
                    </div>
            </section>
        </main>
    </body>
</html>
