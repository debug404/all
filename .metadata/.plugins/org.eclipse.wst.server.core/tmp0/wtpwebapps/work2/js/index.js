$(function() {
	var strThis;
	$(".text").hide();
	var srcs = [];
	var src;

	var begin = $(".tabs").attr("address");
	$(window).load(function() {
		getAjax(begin);

	});

	$('#tt').tree({
		method : 'get',
		url : 'getJsons.do',
		onSelect : function(node) {
			if (node.id == "0") {
				$(".text").hide();
				getAjax(begin);
			} else {
				var a = node.address;
				var str = a.replace(/\\/g, "\\\\");
				strThis = str;
				getAjax(str);
			}

		},
		onLoadSuccess : function(node, data) {
			$('.tree-title').css({
				'font-size' : '20px'
			});
			$('.tree-node').css({
				'height' : '25px'
			});
			$('.tree-file').css({
				'background' : 'url("img/load.png") no-repeat'
			});
		}
	});

	$("tbody").delegate(".open", "click", function() {
		$(".text").show();

		var a = $(this).prop("id");
		var str = a.replace(/\\/g, "\\\\");
		strThis = str;

		src = $(".open").eq(0).attr("tag");
		srcs[srcs.length] = src;

		getAjax(str);

		$(".thisLoc").html(str.substring(4, str.length));

	});

	$(".back").click(function() {

		var len = srcs.length;
		var str = srcs[len - 1]
		getAjax(str);
		srcs.length = len - 1;
		$(".thisLoc").html("");
		$(".thisLoc").html(str.substring(4, str.length));
		if(srcs.length==0)
		{
			$(".text").hide();
		}

	});

	$(".backIndex").click(function() {
		$(".text").hide();
		srcs.length = 0;
		$(".thisLoc").html("");
		getAjax(begin);

	});

	function getAjax(str) {

		$.ajax({
			url : "getFiles.jsp?path=" + str,
			cache : false,
			success : function(html) {
				if (html.trim() == "download") {
					window.location = "download.jsp?path=" + str;
				} else {

					$(".tabs").children().remove();
					$(".tabs").append(html);
				}
			}
		});

	}

	$(".create").click(function() {

		$("#wids").modal({
			remote : "modal.jsp"
		});

	});
	$(".modal-content").delegate("#btn2", "click", function() {
		$('#wids').modal('hide');
	});
	$(".modal-content").delegate("#btn1", "click", function() {
		var name = $("#myTextarea").val().trim();
		if ($(".open").length != 0) {
			strThis = $(".open").eq(1).attr("tag");
		}

		$.ajax({
			url : "create.jsp?path=" + strThis + "&name=" + name,
			cache : false,
			success : function(html) {
				$('#wids').modal('hide');
			}
		});
		getAjax(strThis);

	});

});