function getBook(id){
fetch("http://localhost:8080/books/"+id)
.then(data => data.json())
.then(function(data){ showBook(data);});
}


function showBook(bookdata){
	console.log(bookdata.id);
	var bookdetails = "<br/>ID: "+ bookdata.id +
	"<br/>Title: "+bookdata.title +
	"<br/>Author: "+ bookdata.authors;
	document.getElementById("bookdetails").innerHTML = bookdetails ;
}


function getReview(id){
fetch("http://localhost:8080/reviews/"+id)
.then(data => data.json())
.then(function(data){ showReview(data);});
}


function showReview(reviewdata){
	console.log(reviewdata.id);
	var reviewdetails = "<br/>ID: "+ reviewdata.id +
	
	"<br/>Review: "+ reviewdata.review;
	document.getElementById("reviewdetails").innerHTML = reviewdetails ;
}


function getBookAndReview(id) {
    getBook(id);
    getReview(id);
}

