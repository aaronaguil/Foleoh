
angular.module('authModule').component('register', {
	templateUrl : 'app/authModule/register/register.component.html',
	controller : function(authService, $location) {
		var vm = this;
		vm.errors = [];
		
	},
	controllerAs : 'vm'
});