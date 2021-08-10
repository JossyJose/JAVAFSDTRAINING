<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
  
<html>


    <link rel="stylesheet" type="text/css" href="Stl.css">

		<h1 align="center">Add New Employee</h1>
       <form:form method="post" action="save">  
       <div class="form-group">
      	<table >  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name" class="t1" /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="salary"  class="t1"/></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input path="designation" class="t1"/></td>
         </tr> 
         <tr>  
          <td>Address :</td>  
          <td><form:input path="address" class="t1"/></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" class="svbtn"/></td>  
         </tr>  
        </table>
        </div>  
       </form:form>  
</html>