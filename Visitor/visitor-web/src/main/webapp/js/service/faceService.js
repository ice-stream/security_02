//服务层
app.service('faceService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../face/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('http://localhost:9102/face/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../face/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('http://localhost:9102/face/face/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('http://localhost:9102/face/face/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('http://localhost:9102/face/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('http://localhost:9102/face/search.do?page='+page+"&rows="+rows, searchEntity);
		

}
	//下拉列表数据
	this.selectOptionList=function(){
		return $http.get('../face/selectOptionList.do');
	}
	
});
