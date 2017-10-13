var app=angular.module("myApp",["ngRoute"]);


// 1) Partie Administrateur
// Afficher liste des produits 
app.controller("findAllProduit", function($scope,$http){
	$http.get("http://localhost:8080/ProjetFinalGroupe2Client/findAllProduit")
	.then(function(response){
		$scope.produit=response.data;
	})
	
	

.catch(function(reason){
	  alert("impossible de recuperer les les donnees");
	  console.log(reason);
})

});


//Ajouter des produits 
app.controller("createProduit",function($scope,$http){
	$scope.ajouter=function(){
		$http.post("http://localhost:8080/ProjetFinalGroupe2Client/createProduit", $scope.produit)
		.then(function(data){
			$scope.produit=data;
		})
		.catch(function(reason) {
			alert("erreur d'ajout");
			console.log(reason);
		})
	}
});


//Modifier des produits 
app.controller("updateProduit",function($scope,$http){
	$scope.modifier=function(){
		$http.post("http://localhost:8080/ProjetFinalGroupe2Client/updateProduit", $scope.produit)
		.then(function(data){
			$scope.produit=data;
		})
		.catch(function(reason) {
			alert("erreur d'ajout");
			console.log(reason);
		})
	}
});




//Supprimer des produits
app.controller("deleteProduit",function($scope,$http){
	$scope.produit={};
	$scope.supprimer=function(){
		$http.post("http://localhost:8080/ProjetFinalGroupe2Client/deleteProduit", $scope.produit)
		.then(function(value){
			$scope.produit=value;
		})
		.catch(function(reason) {
			alert("erreur");
			console.log(reason);
		});
	}
});


//Afficher liste des produits 
app.controller("findAllClient", function($scope,$http){
	$http.get("http://localhost:8080/ProjetFinalGroupe2Client/findAllClient")
	.then(function(response){
		$scope.client=response.data;
	})
	
	

.catch(function(reason){
	  alert("impossible de recuperer les les donnees");
	  console.log(reason);
})

});


//Ajouter des clients 
app.controller("createClient",function($scope,$http){
	$scope.ajouter=function(){
		$http.post("http://localhost:8080/ProjetFinalGroupe2Client/createClient", $scope.client)
		.then(function(data){
			$scope.client=data;
		})
		.catch(function(reason) {
			alert("erreur d'ajout");
			console.log(reason);
		})
	}
});


//Modifier des produits 
app.controller("updateClient",function($scope,$http){
	$scope.modifier=function(){
		$http.post("http://localhost:8080/ProjetFinalGroupe2Client/updateClient", $scope.client)
		.then(function(data){
			$scope.client=data;
		})
		.catch(function(reason) {
			alert("erreur d'ajout");
			console.log(reason);
		})
	}
});




//Supprimer des produits
app.controller("deleteClient",function($scope,$http){
	$scope.client={};
	$scope.supprimer=function(){
		$http.post("http://localhost:8080/ProjetFinalGroupe2Client/deleteClient", $scope.client)
		.then(function(value){
			$scope.client=value;
		})
		.catch(function(reason) {
			alert("erreur");
			console.log(reason);
		});
	}
});

//2) Partie Client
// 
