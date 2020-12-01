<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
            <th>学号</th>
            <th>姓名</th>
            <th>密码</th>
        </thead>
        <tbody>
            <#list students as stu>
                <tr>
                    <td>${stu.getStuId()!}</td>
                    <td>${stu.getStuName()!}</td>
                    <td>${stu.getPassword()!}</td>
                </tr>
            </#list>
        </tbody>
    </table>
</body>
</html>