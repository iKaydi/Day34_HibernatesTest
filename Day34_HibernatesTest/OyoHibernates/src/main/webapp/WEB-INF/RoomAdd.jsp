<%@page import="com.OyoHibernates.Room"%>
<%@page import="com.OyoHibernates.Status"%>
<%@page import="com.OyoHibernates.SessionHelper"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Room room = new Room();
room.setRoomid(request.getParameter("roomid"));
room.setStatus(Status.AVAILABLE);
room.setCostperday(Integer.parseInt(request.getParameter("cpd")));
room.setType(request.getParameter("roomtype"));

SessionFactory sf = SessionHelper.getFactory();
Session s=sf.openSession();
Transaction t = s.beginTransaction();
s.save(room);
t.commit();
out.println("*** Record Inserted ***");
%>
</body>
</html>