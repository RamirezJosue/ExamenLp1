/* global SERVER, ACTIVE */

'use strict';

app.controller('campaignController', ['$scope', '$rootScope', '$http', '$location', '$routeParams', function ($scope, $rootScope, $http, $location, $routeParams) {

        $scope.headingTitle = "Configuración de Campañas";
        $scope.campaigns = [];
        $scope.campaign = {};
        $scope.idCampaign = $routeParams.id;

        $scope.initialize = function () {
            $scope.loadData();
            if ($scope.idCampaign) {
                $scope.findCampaign();
            }
        };

        $scope.loadData = function () {
            $http({
                url: SERVER + "/campaign/all",
                method: "GET"
            }).success(function (response) {
                $scope.campaigns = response;
            }).error(function (err) {
                console.log(err);
            });
        };

        $scope.saveCampaign = function () {
            $http({
                url: SERVER + '/campaign/add',
                data: $scope.campaign,
                method: "POST",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}
            }).success(function (data) {
                $location.path("/campaign");
            }).error(function (err) {
                console.log(err);
            });
        };

        $scope.editCampaign = function () {
            $http({
                url: SERVER + '/campaign/edit',
                data: $scope.campaign,
                method: "POST",
                headers: {'Content-Type': 'application/json; charset=UTF-8'}
            }).success(function (data) {
                $location.path("/campaign");
            }).error(function (err) {
                console.log(err);
            });
        };

        $scope.confirmDeleteCampaign = function (id) {
            $('#deleteModal').modal();
            $("#deleteButton").click(function () {
                $scope.removeCampaign(id);
                $('#deleteModal').modal('hide');
            });
        };

        $scope.removeCampaign = function (id) {
            $http({
                url: SERVER + "/campaign/remove/" + id,
                method: "DELETE"
            }).success(function (response) {
                $scope.loadData();

            }).error(function (err) {
                console.log(err);

            });
        };

        $scope.findCampaign = function () {
            $http({
                url: SERVER + "/campaign/find/" + $scope.idCampaign,
                method: "GET"
            }).success(function (response) {
                $scope.campaign = response;
            }).error(function (err) {
                console.log(err);
            });
        };

        $scope.initialize();
    }]);


