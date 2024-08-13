<%--
  Created by IntelliJ IDEA.
  User: JHTA
  Date: 2024-08-13
  Time: 오후 7:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>회원가입폼</h1>
    <form method="post" action="register">

        <label>아이디</label>
        <input type="text" name="username"><br>

        <label>비밀번호</label>
        <input type="text" name="password"><br>

        <label>닉네임</label>
        <input type="text" name="nickname"><br>

        <label>이메일</label>
        <input type="text" name="email"><br>

        <button type="submit">가입</button>
    </form>
</body>
</html>
