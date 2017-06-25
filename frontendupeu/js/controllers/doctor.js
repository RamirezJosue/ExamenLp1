/* global SERVER */

'use strict';

app.controller('doctorsController', ['$scope', '$rootScope', '$http', '$location', '$routeParams', function ($scope, $rootScope, $http, $location, $routeParams) {
        $scope.headingTitlex = "Doctor List UPeU";
        $scope.doctors = [];

        $scope.initialize = function () {
            console.log('Sistema de Mensajería ver Dientes');
            $scope.loadData();           
        };

        $scope.loadData = function () {
            $http({
                url: SERVER2 + "/BackendUPeU/doctor/all",
                method: "GET",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}
            }).success(function (response) {
                $scope.doctors = response;
            }).error(function (err) {
                console.log(err);
            });
        };
       
        $scope.initialize();

    }]);
