/* global SERVER */

'use strict';

app.controller('diagnosticosController', ['$scope', '$rootScope', '$http', '$location', '$routeParams', function ($scope, $rootScope, $http, $location, $routeParams) {
        $scope.headingTitlex = "Diagnostico List UPeU";
        $scope.diagnosticos = [];
        $scope.diagnostico = {};
        $scope.idDiagnostico = $routeParams.id;
        $scope.nombre = "";

        $scope.initialize = function () {
            console.log('Sistema de Mensajería ver Diagnostico');
            $scope.loadData(); 
            if ($scope.idDiagnostico) {
                $scope.findDiagnostico();
            }            
            if ($scope.nombre) {
                $scope.loadDataNombre();
            } 
        };

        $scope.loadData = function () {
            
            $http({
                url: SERVER2 + "/BackendUPeU/diagnostico/all",
                method: "GET",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}
            }).success(function (response) {
                $scope.diagnosticos = response;
            }).error(function (err) {
                console.log(err);
            });
        };
        $scope.loadDataNombre = function () {
            
            $http({
                url: SERVER2 + "/BackendUPeU/diagnosticos/findn/"+$scope.nombre,
                method: "GET",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}
            }).success(function (response) {
                $scope.diagnostico = response;
                $location.path("/buscar");
            }).error(function (err) {
                console.log(err);
            });
            
        };
        $scope.saveDiagnositco = function () {
            console.log('josue');
            $http({
                url: SERVER2 + '/BackendUPeU/diagnosticos/add',
                data: $scope.diagnostico,
                method: "POST",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}
            }).success(function (data) {
                //$scope.loadData();
                window.location="#/diagnosticos";
            }).error(function (err) {
                console.log(err);
            });
            
        };
        $scope.confirmDeleteDiagnostico= function (id) {
            $('#deleteModal').modal();
            $("#deleteButton").click(function () {
                $scope.removeDiagnostico(id);
                $('#deleteModal').modal('hide');
            });
        };
        
        $scope.removeDiagnostico = function (id) {
            $http({
                url: SERVER2 + "/BackendUPeU/diagnostico/remove/"+id,
                method: "DELETE"
            }).success(function (response) {
                $scope.loadData();

            }).error(function (err) {
                console.log(err);

            });
        };
        $scope.findDiagnostico = function(){            
            $http({
                url: SERVER2 + "/BackendUPeU/diagnosticos/find/"+$scope.idDiagnositco,
                method: "GET",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}                
            }).success(function (response) {               
                $scope.diagnostico = response;
              
            }).error(function (err) {
                console.log(err);
            });
        };
        $scope.editDiagnostico = function () {
            $http({
                url: SERVER2 + '/BackendUPeU/diagnosticos/edit',
                data: $scope.diagnostico,
                method: "POST",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}
            }).success(function (data) {
                $location.path("/diagnosticos");
            }).error(function (err) {
                console.log(err);
            });
        };
       
        $scope.initialize();

    }]);
