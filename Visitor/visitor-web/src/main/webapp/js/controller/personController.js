 //控制层 
app.controller('personController' ,function($scope,$controller   ,personService,uploadService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
  
	
	
	//上传图片
	$scope.uploadFile=function(){
		uploadService.uploadFile().success(
			function(response){
				if(response.success){
					$scope.image_entity.url= response.message;
				}else{
					alert(response.message);					
				}
			}		
		);
		
		
	}
	
$scope.entity={securityAtt:{attImage:[]}  };
	
	//将当前上传的图片实体存入图片列表
	$scope.add_image_entity=function(){
		$scope.entity.securityAtt.attImage.push($scope.image_entity);			
	}
	
	//移除图片
	$scope.remove_image_entity=function(index){
		$scope.entity.securityAtt.attImage.splice(index,1);
	}
	
});	
