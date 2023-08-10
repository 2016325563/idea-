<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/jquery-1.7.2.js"></script>
    <script type="text/javascript">


        // $('#addActor').click(function (e) {
        //     e.preventDefault();
        //
        //     var actorId = $('#newActorId').val();
        //     var actorName = $('#newActorName').val();
        //     var age = $('#newAge').val();
        //     var gender = $('#newGender').val();
        //     var representativeWorks = $('#newRepresentativeWorks').val();
        //     var stageName = $('#newStageName').val();
        //     var actorData = {
        //         actorId: actorId,
        //         actorName: actorName,
        //         age: age,
        //         gender: gender,
        //         representativeWorks: representativeWorks,
        //         stageName: stageName
        //     };
        //     $.ajax({
        //         type: 'POST',
        //         url: 'addActor',
        //         data: JSON.stringify(actorData),
        //         success: function (response) {
        //             console.log('Actor插入成功');
        //         },
        //         error: function (xhr, status, error) {
        //             console.error('插入失败actor:', error);
        //         }
        //     });
        // });


        $(function () {
            /*捕捉新的行*/
            $('#tableBody').on('click', '.addActorButton', addActor);

            function addActor(event) {
                event.preventDefault();

                var $row = $(this).closest('tr');
                var actorData = {
                    /*捕捉各种新行的数据*/
                    actorId: $row.find('.newActorId').val(),
                    actorName: $row.find('.newActorName').val(),
                    age: $row.find('.newAge').val(),
                    gender: $row.find('.newGender').val(),
                    representativeWorks: $row.find('.newRepresentativeWorks').val(),
                    stageName: $row.find('.newStageName').val()
                };
                console.log(actorData);
                $.ajax({
                    type: 'POST',
                    url: 'addActor',
                    /*使用json字符串化传递参数*/
                    data: JSON.stringify(actorData),
                    contentType: 'application/json;charset=utf-8',
                    success: function (response) {
                        console.log('Actor插入成功');
                        // 在成功回调中触发后端方法来获取最新数据
                        //triggerGetAllActorOrAlike();
                        location.reload(); // 这会重新加载整个页面
                    },
                    error: function (xhr, status, error) {
                        console.error('插入失败actor:', error);
                        // 可以显示错误消息给用户
                    }
                });

                // 在成功回调中触发后端方法
                // function triggerGetAllActorOrAlike() {
                //     $.ajax({
                //         type: 'post',
                //         url: 'getAllActorOrAlike', // 替换为你的后端控制层路径
                //         success: function (data) {
                //             // 这里可以处理返回的最新数据，更新页面等操作
                //         },
                //         error: function (xhr, status, error) {
                //             console.error('获取最新数据失败:', error);
                //             // 可以显示错误消息给用户
                //         }
                //     });
                // }
            }
        });




    </script>
    <%--一个bootstrap的组件--%>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

</head>
<body style="width: 800px;margin:0 auto">
<h1>Hello World!</h1>
<br>


<form action="getAllActorOrAlike" method="post">

    代表作搜索:<input type="text" name="representativeWorks">
    <input type="submit" value="提交查询">


</form>
<table class="table" style="width: 800px ;margin:0 auto" id="tableBody">
    <thead>
    <tr>

        <th scope="col">演员id</th>
        <th scope="col">演员名字</th>
        <th scope="col">演员年龄</th>
        <th scope="col">演员性别</th>
        <th scope="col">演员代表作</th>
        <th scope="col">演员艺名</th>
        <th scope="col">操作</th>

    </tr>
    </thead>
    <tbody>

    <c:forEach var="actor" items="${ActorList}">
        <tr>
            <td>${actor.actorId}</td>
            <td>${actor.actorName}</td>
            <td>${actor.age}</td>
            <td>${actor.gender}</td>
            <td>${actor.representativeWorks}</td>
            <td>${actor.stageName}</td>
                <%--使用了一个问号传参参数的方法--%>
            <td><a href="delById?actorId=${actor.actorId}">删除</a></td>


        </tr>
    </c:forEach>

    <tr>
        <td><input type="text" class="newActorId" placeholder="" style="width: 48px"></td>
        <td><input type="text" class="newActorName" placeholder="" style="width: 48px"></td>
        <td><input type="text" class="newAge" placeholder="" style="width: 48px"></td>
        <td><input type="text" class="newGender" placeholder="" style="width: 48px"></td>
        <td><input type="text" class="newRepresentativeWorks" placeholder="" style="width: 48px"></td>
        <td><input type="text" class="newStageName" placeholder="" style="width: 48px"></td>
        <td><button class="addActorButton">添加</button></td>
    </tr>

    </tbody>
</table>
</body>
</html>
