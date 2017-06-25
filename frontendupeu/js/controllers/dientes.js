/* global SERVER */

'use strict';

app.controller('dientesController', ['$scope', '$rootScope', '$http', '$location', '$routeParams', function ($scope, $rootScope, $http, $location, $routeParams) {
        $scope.headingTitlex = "Diente List UPeU";
        $scope.dientes = [];
        $scope.diente = {};
        $scope.idDiente = $routeParams.id;
        $scope.nombre = "";
        
        $scope.initialize = function () {
            console.log('Sistema de Mensajería ver Dientes');
            $scope.loadData();
            if ($scope.idDiente) {
                $scope.findDiente();
            }            
            if ($scope.nombre) {
                $scope.loadDataNombre();
            }            
        };

        $scope.loadData = function () {
            $http({
                url: SERVER2 + "/BackendUPeU/dientes/all",
                method: "GET",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}
            }).success(function (response) {
                $scope.dientes = response;
            }).error(function (err) {
                console.log(err);
            });
        };
        $scope.loadDataNombre = function () {
            $http({
                url: SERVER2 + "/BackendUPeU/dientes/findn/"+$scope.nombre,
                method: "GET",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}
            }).success(function (response) {
                $scope.dientes = response;
                $location.path("/buscar");
            }).error(function (err) {
                console.log(err);
            });
        };
        
        $scope.saveDiente = function () {
            $http({
                url: SERVER2 + '/BackendUPeU/dientes/add',
                data: $scope.diente,
                method: "POST",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}
            }).success(function (data) {
                //$scope.loadData();
                window.location="#/dientes";
            }).error(function (err) {
                console.log(err);
            });
        };
        
        $scope.confirmDeleteDiente = function (id) {
            $('#deleteModal').modal();
            $("#deleteButton").click(function () {
                $scope.removeDiente(id);
                $('#deleteModal').modal('hide');
            });
        };

        $scope.removeDiente = function (id) {
            $http({
                url: SERVER2 + "/BackendUPeU/dientes/remove/"+id,
                method: "DELETE"
            }).success(function (response) {
                $scope.loadData();

            }).error(function (err) {
                console.log(err);

            });
        };        
        $scope.findDiente = function(){            
            $http({
                url: SERVER2 + "/BackendUPeU/dientes/find/"+$scope.idDiente,
                method: "GET",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}                
            }).success(function (response) {               
                $scope.diente = response;
              
            }).error(function (err) {
                console.log(err);
            });
        };
        $scope.editDiente = function () {
            $http({
                url: SERVER2 + '/BackendUPeU/dientes/edit',
                data: $scope.diente,
                method: "POST",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}
            }).success(function (data) {
                $location.path("/dientes");
            }).error(function (err) {
                console.log(err);
            });
        };        
        $scope.initialize();

    }]);
