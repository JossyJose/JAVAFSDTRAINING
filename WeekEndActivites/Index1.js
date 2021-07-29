var app=angular.module('myApp',["ngRoute"])
app.config(function($routeProvide){
    $routeProvider.when("/one",{
        templateUrl:"one.html",
        controller:"myCtrl"
    }).when("/two",{
        templateUrl:"two.html",
        controller:"myCtrl2"
    })
})
app.controller('myCtrl',function($scope){
    $scope.msg="Iam from Ist controller"
})
app.controller('myCtrl2',function($scope){
    $scope.msg="Iam from 2nd controller"
})