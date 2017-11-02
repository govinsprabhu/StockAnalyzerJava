$(document).ready(function(){
				$("#submit_btn").click(function(){
					console.log('*** submit button pressed ...');
					var username1 = $("#inputEmail3").val();
					var password1 = $("#inputPassword3").val();
					console.log('*** username '+ username1+' password '+ password1);
					$.ajax({
				         type: "GET",
				         url: "http://localhost:8080/validate",
				         data: {username: username1, password: password1},
				         contentType: "application/json; charset=utf-8",
				         success: function(response){
                         				        	 console.log('*** success .....' + response);
                         				             window.location.href = "http://localhost:8080/all";
                         			             },
			             error:function(error){
			                alert('failure : ' + error);
			                console.log('*** error .....'+error);
			             }
				     });
				});
		});