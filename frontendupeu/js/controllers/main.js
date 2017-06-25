'use strict';

app.controller('mainController', ['$scope', '$rootScope', '$http', function ($scope, $rootScope, $http) {
        console.log('Sistema de Mensajería');
        $(function () {
            $("[data-tooltip='tooltip']").tooltip();
        });
    }]);