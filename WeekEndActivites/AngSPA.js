var myApp=angular.module("myList",[]);
myApp.controller("myListController",function($scope){

    $scope.items=["AngularJS","ReactJS","UnderscoreJS"];
$scope.newItem="";
$scope.pushItem=function()
{
    if($scope.items!=""){
$scope.items.push($scope.newItem)
$scope.newItem="";
    }
}
$scope.deleteitem=function(index)
{
    $scope.items.splice(index,1);
}
});