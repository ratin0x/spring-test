angular.module('hello', [])
  .controller('home', function($scope, $http) {
    // $scope.greeting = {id: 'xxx', content: 'Hello World!'}
    $http.get('/resource/').then( function( data ) {
    	$scope.greeting = data;
    }, function(error) {
    	$scope.greeting = error;
    });
})