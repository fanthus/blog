<%--
  Created by IntelliJ IDEA.
  User: xiushanfan
  Date: 2020/6/5
  Time: 4:13 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.5.1.min.js.css"></script>
    <script type="text/javascript">
        $(function () {
            var user = {
                "id":1,
                "name":"zhangsan"
            }
            $.ajax({
                url:"/data/json",
                data:JSON.stringify(user),
                type:"POST",
                contentType:"application/json;charset=UTF-8",
                dataType:"JSON",
                success:function (data) {
                    alert(data.id+"---"+data.name);
                }
            })
        })
    </script>
</head>
<body>

</body>
</html>
