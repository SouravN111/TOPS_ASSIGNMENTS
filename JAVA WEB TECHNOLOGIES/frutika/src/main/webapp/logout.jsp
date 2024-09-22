<%
	session.removeAttribute("u");
	session.invalidate();
	request.setAttribute("msg", "User logged out successfullly.");
	request.getRequestDispatcher("login.jsp").forward(request, response);
%>