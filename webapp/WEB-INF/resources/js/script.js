var server = "http://127.0.0.1:8080/cfw_check_api";

function doAttach(obj){
	if(obj.endsWith("/") && document.AttchForm.PARAM.value.trim() == "") {
		alert("PARAM을 입력하세요.");
		return;
	}
	var aaa = window.open(server + obj + document.AttchForm.PARAM.value, "TESTPOP", "");
	aaa.focus();
}
