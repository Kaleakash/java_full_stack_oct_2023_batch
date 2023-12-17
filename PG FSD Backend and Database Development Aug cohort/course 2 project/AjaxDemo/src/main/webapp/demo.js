//alert("file loaded...")
var obj;
function loadObject() {
	obj = new XMLHttpRequest();
	//alert("object loaded...")
	//obj.open("Get","hello.jsp",true);
	obj.open("Get","https://jsonplaceholder.typicode.com/todos",true)
	obj.onreadystatechange =callback
	obj.send();
	
}

function callback() {
	//alert(obj.readyState+" "+obj.status)
	if(obj.readyState==4){
		//console.log(obj.response);
	    console.log(JSON.parse(obj.response));
	}
}
