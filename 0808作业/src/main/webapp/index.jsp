<%--
  Created by IntelliJ IDEA.
  User: qwerty
  Date: 2023/8/8
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/jquery-1.7.2.js"></script>
    <script type="text/javascript">


        $(function () {

            $("#listBtn").click(
                function () {
                    var option1;
                    $.ajax({

                        url: 'returnTeacher',
                        type: 'post',
                        /*不需要传递参数了!!!!!*/
                        data: '',
                        success: function (back) {
                            for (var i = 0; i < back.length; i++) {
                                option1 += "<option value=" + i + ">" + back[i].name;
                            }
                            option1 += "</option>";
                            $("#teacherList").append(option1);

                        }

                    })

                }
            )

            $("#tableBtn").click(
                function () {
                    var table = "<table border='1px'>"
                    $.ajax({

                        url: 'returnDetail',
                        type: 'post',
                        /*不需要传递参数了!!!!!*/
                        data: '',
                        success: function (back) {
                            for (var i = 0; i < back.length; i++) {
                                table += "<tr><td>" + back[i].id + "</td><td>" + back[i].name + "</td><td>" + back[i].age + back[i].phone + "</td><td>" + back[i].address + "</td></tr>"
                            }
                            table += "</table>";
                            $("#teacherTable").append(table);

                        }

                    })

                }
            )

            $("#detailBtn").click(
                function () {
                    var index = $("#infoOfId").val();
                    var detail='';
                    $.ajax({

                        url: 'returnOneDetail',
                        type: 'post',
                        data: {index: index-1},
                        success: function (back) {
                            detail += back.id +"  "+ back.name +"  "+ back.age +"  "+ back.phone +"  "+ back.address;
                            $("#detailList").val(detail);

                        }

                    })

                }
            )


        })


    </script>


    <title>Title</title>
</head>
<body>


<form action="printTeacher" method="post">
    <%--后端的参数使用前台的参数的名字是要一致的--%>
    老师的id:
    <input type="text" name="id">
    <%--参数类型不匹配产生400的错误--%>
    老师的姓名:
    <input type="text" name="name">
    电话:
    <input type="text" name="phone">
    年龄:
    <input type="text" name="age">
    地址:
    <input type="text" name="address">


    <input type="submit">


</form>

<select name="color" id="teacherList">
    <option value="0">请选择老师</option>


</select>
<input type="button" value="获取老师的列表" id="listBtn">
<br>
<div style="width: 300px " id="teacherTable">


</div>
<input type="button" value="获取老师的表格" id="tableBtn">

<br>
<input type="text" value="目标老师的id" id="infoOfId">

<input type="button" value="获取老师的详细信息" id="detailBtn">
<input type="text" value="老师的可能的信息..." id="detailList" style="width: 300px ;height: 100px">

</body>
</html>
