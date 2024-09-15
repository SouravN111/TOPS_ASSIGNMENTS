<%@page import="com.bean.Student"%>
<%
	Student s = null;
	if(session.getAttribute("s")!=null){
		s = (Student)session.getAttribute("s");
	}
%>
<%
	if(s!=null){
%>
	<h1>Welcome <%=s.getFname() %>.</h1>
<a href="logout.jsp">Logout</a> || <a href="home.jsp">Home</a> || <a href="profile.jsp">Profile</a> || <a href="change-password.jsp">Change password</a>
<%
	}
	else{
%>
	<h3><a href="login.jsp">Please login first</a></h3>
<%
	}
%>