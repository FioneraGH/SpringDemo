/**
 * Created by fionera on 16-10-9.
 */
actionApp.controller('View1Controller',['$rootScope','$scope','$http',function ($rootScope, $scope, $http) {
    $scope.$on('$viewContentLoaded',function () {
        alert('load 1 finish');
    });

    $scope.search = function () {
        var personName = $scope.personName;
        $http.get('search',{
            params:{personName:personName}
        }).success(function (data) {
            $scope.person = data;
        })
    }
}]);

actionApp.controller('View2Controller',['$rootScope','$scope',function ($rootScope, $scope) {
    $scope.$on('$viewContentLoaded',function () {
        alert('load 2 finish');
    });
}]);