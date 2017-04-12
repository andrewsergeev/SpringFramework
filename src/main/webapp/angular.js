/**
 * Created by aelsergeev on 4/4/17.
 */

var users = angular.module('users', []);

users.controller('usersTable', function ($scope, $http) {
    var url = 'http://localhost:8080/datajpa';

    $http.get(url).success(function(data) {
        $scope.users = data;
    });
});