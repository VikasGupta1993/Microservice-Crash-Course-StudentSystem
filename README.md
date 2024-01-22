Microservice-Crash-Course-StudentSystem

Create Student
 Request payload:- http://localhost:9091/student/insert
 Request Body:-
   {
    "name": "Arpit Gupta",
    "fatherName": "Vijay Pal Gupta",
    "address": "Pocket5",
    "age": 30
   }
   
 Response:- 
   {
    "id": 3,
    "name": "Arpit Gupta",
    "fatherName": "Vijay Pal Gupta",
    "address": "Pocket5",
    "age": 30,
    "library": null
   } 
  
  
Get Student
  Request payload:- http://localhost:9091/student/1
  Response:-
    {
		"id": 1,
		"name": "Vikas Gupta",
		"fatherName": "DayaChand Gupta",
		"address": "Mayur Vihar phase-1",
		"age": 30,
		"library": {
			"id": 1,
			"name": "Vikas Gupta",
			"address": "Mayur Vihar Phase-1",
			"email": "guptavikas707@gmail.com",
			"book": {
				"id": 1,
				"name": "The Dirk Circle",
				"author": "DayaChand Gupta",
				"price": 200
			}
		}
    }  
	

Create Library
 Request payload:- http://localhost:9092/library/insert
 Request Body:-
   {
    "name": "Juhi Gupta",
    "address": "Uttam Nagar",
    "email": "gupta@gmail.com"
   }
   
 Response:- 
   {
    "id": 3,
    "name": "Juhi Gupta",
    "address": "Uttam Nagar",
    "email": "gupta@gmail.com",
    "book": null
   }
   
Get Library
  Request payload:- http://localhost:9092/library/1
  Response:-
    {
		"id": 1,
		"name": "Vikas Gupta",
		"address": "Mayur Vihar Phase-1",
		"email": "guptavikas707@gmail.com",
		"book": {
			"id": 1,
			"name": "The Dirk Circle",
			"author": "DayaChand Gupta",
			"price": 200
		}
    }
	
	
Create Book
 Request payload:- http://localhost:9094/book/insert
 Request Body:-
   {
    "name": "The Dark Knight",
    "author": "DC Gupta",
    "price": 300
   }
   
 Response:- 
   {
    "id": 3,
    "name": "The Dark Knight",
    "author": "DC Gupta",
    "price": 300
   }
   
Get Book
  Request payload:- http://localhost:9094/book/1
  Response:-
    {
		"id": 1,
		"name": "The Dirk Circle",
		"author": "DayaChand Gupta",
		"price": 200
    }
	
	
API Gateway Call for Student Service
  Request payload:- http://localhost:9096/student/1
  Response:-
    {
		"id": 1,
		"name": "Vikas Gupta",
		"fatherName": "DayaChand Gupta",
		"address": "Mayur Vihar phase-1",
		"age": 30,
		"library": {
			"id": 1,
			"name": "Vikas Gupta",
			"address": "Mayur Vihar Phase-1",
			"email": "guptavikas707@gmail.com",
			"book": {
				"id": 1,
				"name": "The Dirk Circle",
				"author": "DayaChand Gupta",
				"price": 200
			}
		}
    }
	
API Gateway call For Library Service
  Request payload:- http://localhost:9096/library/1
  Response:-
    {
		"id": 1,
		"name": "Vikas Gupta",
		"address": "Mayur Vihar Phase-1",
		"email": "guptavikas707@gmail.com",
		"book": {
			"id": 1,
			"name": "The Dirk Circle",
			"author": "DayaChand Gupta",
			"price": 200
		}
    }	
	
	
API Gateway call For Book Service
  Request payload:- http://localhost:9096/book/1

Eureka Server:- http://localhost:8761/ 	
