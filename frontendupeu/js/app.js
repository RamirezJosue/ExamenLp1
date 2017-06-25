'use strict';
var app = angular.module('app', [
    'ngResource',
    'ngRoute'
]);

var SERVER = 'http://localhost:8083';
var SERVER2 = 'http://localhost:8084';
var ACTIVE = '1';
var INACTIVE = '0';
app.config(['$routeProvider', '$locationProvider', function ($routeProvider, $locationProvider) {
        $routeProvider
                .when('/campaign', {
                    templateUrl: 'views/campaign/campaign.html',
                    controller: 'campaignController'
                })
                .when('/campaign/edit/:id', {
                    templateUrl: 'views/campaign/campaign_edit.html',
                    controller: 'campaignController',
                    method: 'findCampaign'
                })
                .when('/campaign/new', {
                    templateUrl: 'views/campaign/campaign_form.html',
                    controller: 'campaignController'
                })
                .when('/campaign/edit/:id', {
                    templateUrl: 'views/campaign/campaign_edit.html',
                    controller: 'campaignController',
                    method: 'findCampaign'
                })
                .when('/dientes', {
                    templateUrl: 'views/diente/mainDiente.html',
                    controller: 'dientesController'
                })
                .when('/diente/new', {
                    templateUrl: 'views/diente/formDientes.html',
                    controller: 'dientesController'
                })
                .when('/diente/edit/:id', {
                    templateUrl: 'views/diente/editFormDientes.html',
                    controller: 'dientesController',
                    method: 'findDiente'
                })         
                .when('/buscar', {
                    templateUrl: 'views/diente/mainDiente.htm',
                    controller: 'dientesController'
                })         
                .when('/persona', {
                    templateUrl: 'views/persona.html',
                    controller: 'personaController'
                })
                .when('/doctor', {
                    templateUrl: 'views/doctor/doctorMain.html',
                    controller: 'doctorsController'
                })
                
                .when('/diagnostico', {
                    templateUrl: 'views/diagnostico/mainDiagnostico.html',
                    controller: 'diagnosticosController'
                })
                
                .when('/diagnostico/new', {
                    templateUrl: 'views/diagnostico/formDiagnostico.html',
                    controller: 'diagnosticosController'
                })
                 
                .otherwise({redirectTo: '/'});
                
               
                
                


    }]);
