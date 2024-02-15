<%-- 
    Document   : animals
    Created on : 8 août 2023, 09 h 48 min 59 s
    Author     : isi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Lab.*"%>
<%
    ArrayList<Categorie> categories = (ArrayList<Categorie>) request.getAttribute("listCategories");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <header>
            <nav>
                <ul>
                    <li><a href="animals?nom=chien">chien</a></li>
                    <li><a href="animals?nom=chat">chat</a></li>
                    <li><a href="animals?nom=meduse">meduse</a></li>
                    <li><a href="animals?nom=insecte">insecte</a></li>
                </ul>
            </nav>
        </header>
        
        <main>
            <h2>Liste Animal</h2>
            <section>
                <% 
                    int i = 1;
                    for(Categorie cat : categories){
                %>
                    <div>
                        <h3><%=cat.getAnimal().getNom()%></h3>
                        <img src="img/<%=cat.getNom() + i%>.jpg" alt="alt"/>
                        <a href="animal.jsp?nom=<%=cat.getAnimal().getNom()%>&param=<%=cat.getNom() + i%>">Afficher</a>
                    </div>
                <%
                    i = i < 2 ? ++i : 1;
                    }
                %>
                    
            </section>
        </main>
    </body>
</html>
