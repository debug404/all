$(function() {
	var val = false;


	$("#username").blur(function() {

		var reg = /(\S)+[@]{1}(\S)+[.]{1}(\w)+/;
		var username = $(this).val();

		if (reg.test(username) == false) {

			$(".info").html("请输入正确的邮箱".fontcolor("red"));
			val = false;
			return false;
		}
		val = true;


	});


	$(".form").submit(function() {
		return val;
	});


















});