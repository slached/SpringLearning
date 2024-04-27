Here is Movie table 

| id(int) | name(string) | rating(double) |
| ------- | ------------ | -------------- |
| 1       | movie 1      | 1.3            |
| 2       | movie 2      | 2.6            |

---

# Note:
baseUrl is host
Port is 8080 for this case
## Post
`{{baseURL}}{{PORT}}/api/createMovie`
this endpoint used for create movie. {requires body}
### body
{
	"name":"Movie 1",
	"rating":4.54
}
if you enter id by mistake you get bad request response .

---

## Get
`{{baseURL}}{{PORT}}/api/getAllMovies`
this endpoint used for get all movies exists.

`{{baseURL}}{{PORT}}/api/getMovie/:id`
this endpoint used for get specific movie by id. {requires id param}

---

## Put
`{{baseURL}}{{PORT}}/api/changeMovieInfo`
this endpoint used for change movie informations and body must be like: {requires body}

### body
{
	"id":"valid id", 
	"name":"Movie 1",
	"rating":4.54
}

---
## Delete
`{{baseURL}}{{PORT}}/api/deleteOneMovie/:id`
this endpoint used for delete movie by id: {requires id}
