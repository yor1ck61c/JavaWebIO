<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/jquery@3.4.1/dist/jquery.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <script src="https://lib.sinaapp.com/js/jquery/2.0.2/jquery-2.0.2.min.js"></script>

    <title>用户登录</title>

</head>
<body>
<div class="container-fluid">
        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4">
                <form method="post" action="${pageContext.request.contextPath}/userLoginServlet">
                    <h1 style="margin-top: 100px; text-align: center">用户登录</h1>
                    <div class="input-group input-group-lg" style="margin-top: 50px;">
                        <div class="input-group-prepend">
                            <span class="input-group-text">用户名</span>
                        </div>
                        <input type="text" id="username" name="username" onblur="checkUsername()" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-lg">
                        <div id="username_prompt" style="margin-top: 5px"></div>
                    </div>
                    <div class="input-group input-group-lg" style="margin-top: 50px; ">
                        <div class="input-group-prepend">
                            <span class="input-group-text" >密码</span>
                        </div>
                        <input type="password" id="password" name="password" onblur="checkPassword()" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-lg" >
                        <div id="password_prompt" style="margin-top: 5px"></div>
                    </div>
                    <button type="submit" id="button" class="btn btn-secondary" style="margin-top: 50px; margin-left: 210px">登录</button>
                </form>
            </div>
        </div>
</div>

</body>
</html>
