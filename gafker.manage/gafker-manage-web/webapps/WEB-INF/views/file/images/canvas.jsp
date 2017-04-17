<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>localResizeIMG</title>
    <!--引入JQuery 用于异步上传图片-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
    <!--引入 lrz 插件 用于压缩图片-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/localresize/lrz.bundle.js"></script>
</head>
<body>
<input type="file" accept="image/*" class="reg"><br/>
<img id="uploadwarm"/>
</body>
<script>
    $("input[type=file]").change(function () {
        /* 压缩图片 */
        lrz(this.files[0], {
            //width: 300, //设置压缩参数
            quality: 0.7
        }).then(function (rst) {
            /* 处理成功后执行 */
            rst.formData.append('base64img', rst.base64); // 添加额外参数
            $.ajax({
                url: "${pageContext.request.contextPath}/upoadImgBase64Canvas",
                type: "POST",
                data: rst.formData,
                processData: false,
                contentType: false,
                success: function (data) {
                   // $("<img />").attr("src", data).appendTo("body");
                    $("img#uploadwarm").attr("src", data.base64img).css({"width":"100px","height":"120px",});
                    $("#warmfile").attr("value",data.warmfile);
                }
            });
        }).catch(function (err) {
            /* 处理失败后执行 */
        }).always(function () {
            /* 必然执行 */
        })
    })
</script>
</html>