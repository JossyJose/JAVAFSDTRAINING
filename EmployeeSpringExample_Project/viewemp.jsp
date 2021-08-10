    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  


<link rel="stylesheet" type="text/css" href="Stl.css">


	<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Address</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="emp" items="${list}"> 
    <tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.salary}</td>
    <td>${emp.designation}</td>
    <td>${emp.address}</td>
    <td><a href="editemp/${emp.id}" class="edt"></a></td>
    <td><a href="deleteemp/${emp.id}" class="dlt"></a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <button class="addemp_btn"><a href="empform" class="addemp_btnlnk"><b>Add New Employee</b></a></button>