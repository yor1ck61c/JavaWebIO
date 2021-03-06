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

    <title>作业管理页面</title>

</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <div style="margin-top: 50px;">
                <div class="container" style=" text-align: center">
                    <h1 class="display-4">作业提交系统</h1>
                </div>
                <div style="margin-top: 50px">
                    <form method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/uploadHomeworkServlet" class="was-validated" style="text-align: center;">
                        <input type="file" name="homework" id="homework">
                        <button type="submit" class="btn btn-primary-outline btn-lg border rounded-pill" >提交作业</button>
                    </form>
                </div>
                <div style="margin-top: 50px; text-align: center">
                    <a href="findAllHomeworkServlet"><button type="button" class="btn btn-primary-outline btn-lg border rounded-pill" >查看已提交的作业</button></a>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>