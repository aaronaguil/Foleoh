angular.module('appModule',['staticModule','job','navigation', 'portfolio', 'project','authModule'])
	.config(function($routeProvider){
		$routeProvider
			.when('/', {
			template : '<home></home>'
			})
			.when('/profile', {
				template : '<profile></profile>'
			})
			.when('/login', {
			
				template : "<login></login>"
				
			}).when('/register', {
			
				template : "<register></register>"
				
			})
			.otherwise({
				template : '<not-found></not-found>'
			})
			
	})