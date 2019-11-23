<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Register</title>
<s:head/>
</head>
<body>
	<h3>Register for a prize by completing this form.</h3>
	<s:form action="register" method="post">
      <s:textfield name="personBean.firstName" label="First name" />
      <s:textfield name="personBean.lastName" label="Last name" />
      
      <s:select key="personBean.sport" list="sports" />
     
      <s:radio key="personBean.gender" list="genders" />
      <s:select key="personBean.residency" list="states" listKey="stateAbbr" listValue="stateName" />
      <s:checkbox key="personBean.over21" />
      <s:checkboxlist key="personBean.carModels" list="carModelsAvailable" />
      
      <s:submit key="submit"/>
      </s:form>
<s:url action="registerInput" var="registerInputLink" />
<p><s:a href="%{registerInputLink}">Please register</s:a> for our prize drawing.</p>

</body>
</html>