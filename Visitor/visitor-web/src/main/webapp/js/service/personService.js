//服务层
app.service('personService',function($http){
	    	
	
	//增加 
	this.add=function(entity){
		return  $http.post('../attendance/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../attendance/update.do',entity );
	}
	
});
