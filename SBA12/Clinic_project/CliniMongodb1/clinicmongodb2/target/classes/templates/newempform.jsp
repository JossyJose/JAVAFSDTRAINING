<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="#" th:action="@{/save}" th:object="${employee}"
			method="POST">
			
			<input type="text" th:field="*{firstName}"
				placeholder="Employee First Name" >
				
				<input type="text" th:field="*{lastName}"
				placeholder="Employee Last Name" >
				
				<input type="text" th:field="*{email}"
				placeholder="Employee Email" >
				
				<button type="submit" > Save Employee</button>
		</form>
</body>
</html>