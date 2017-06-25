/* global SERVER */

'use strict';

app.controller('personaController', ['$scope', '$rootScope', '$http', function ($scope, $rootScope, $http) {
        $scope.headingTitle = "Persona List UPeU";
        $scope.personas = [];

        $scope.initialize = function () {
            console.log('Sistema de Mensajería ver');
            $scope.loadData();
        };

        $scope.loadData = function () {
            $http({
                url: SERVER + "/persona/all",
                method: "GET"
            }).success(function (response) {
                $scope.personas = response;
            }).error(function (err) {
                console.log(err);
            });
        };

        $scope.initialize();

    }]);