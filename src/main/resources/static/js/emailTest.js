$(function(){
    $("#sendBtn").click(function(){
        sendNumber();
        var num1 = $("#mail").val();
        var num2 = $("#Confirm").val();


    });


});
function sendNumber(){
    $("#mail_number").css("display", "block");
        $.ajax({
            url:"/mail",
            type:"post",
            dataType:"json",
            data:{"mail" : $("#mail").val()},
            success:function(data){
                alert("인증번호 발송");
                $("#Confirm").attr("value", data);

            }
        });
}

function confirmNumber(){
    var number1 = $("#number").val();
    var number2 = $("#Confirm").val();

    console.log(number1);
    console.log(number2);

    if(number1 == number2){
        alert("인증성공");
    }else{
        alert("인증실패");
    }
}