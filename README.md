## Following are the two rest endpoints - 

### 1. [GET] localhost:8080
> output: Hello from spring boot docker

### 2. [POST] localhost:8080/products
sample JSON data -
```
{
    "id" : 1,
    "name" : "laptop",
    "quantity" : 10
}
```

>output: {
"id" : 1,
"name" : "laptop",
"quantity" : 10
}

## Docker command
>docker run -p 8080:8080 dockerize-app
