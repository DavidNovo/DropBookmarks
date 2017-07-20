# Testing the Endpoints

I like to use Postman, but you can use anything.

## The endpoints
    GET     /Hello (net.novogrodsky.resources.HelloResource)
    GET     /hello-saying (net.novogrodsky.resources.SayingResource)

The endpoints are very simple.  
### GET     /Hello (net.novogrodsky.resources.HelloResource)
This endpoint returns the String Hello World.  The request must look like this:
 http://localhost:8080//Hello
     
### GET     /hello-saying (net.novogrodsky.resources.SayingResource)
This endpoint returns a JSON object.  The request looks like this: http://localhost:8080//hello-saying?name=David
where the query string is optional.  If there is a query string the reply looks like this:
    
    {
        "id": 3,
        "content": "Hello, David!"
    }
    
If a query string is not supplied, the reply looks like this:

    {"id":4,"content":"Hello, Stranger!"}
    
    