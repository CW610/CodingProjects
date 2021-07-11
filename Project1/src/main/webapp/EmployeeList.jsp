<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    
        <html>

        <head>
            <title>User Management Application</title>
            
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: rgb(255, 165, 0)">
                    

                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Users</a></li>
                    </ul>
                </nav>
            </header>
            <br>

            <div class="row">
                <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

                <div class="container">
                    <h3 class="text-center">List of Users</h3>
                    <hr>
                    <div class="container text-left">

                        
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Salary</th>
                                <th>Username</th>
                                <th>Password</th>
                                <th>Job Title </th>
                                <th>Address </th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="employee" items="${Emp}">

                                <tr>
                                    <td>
                                        <c:out value="${employee.empID}" />
                                    </td>
                                    <td>
                                        <c:out value="${employee.name}" />
                                    </td>
                                    <td>
                                        <c:out value="${employee.salary}" />
                                    </td>
                                    <td>
                                        <c:out value="${employee.username}" />
                                    </td>
                                    <td>
                                        <c:out value="${employee.password}" />
                                    </td>
                                    <td>
                                        <c:out value="${employee.jobTitle}" />
                                    </td>
                                    <td>
                                        <c:out value="${employee.address}" />
                                    </td>
                                    <td><a href="edit?id=<c:out value='${employee.empID}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp;</td>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
            </div>
        </body>

        </html>