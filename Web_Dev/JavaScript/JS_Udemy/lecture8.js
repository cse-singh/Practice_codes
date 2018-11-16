var firstName = "laurence";  // String
var age = 10; // Integer
var age2 = 5;
var courseName = " JavaScript";  // String
var fiv = "5";
var boo = false; // Boolean

var myArray = ["JavaScript",50,10,false,"Course"];
console.log(myArray[0]);
myArray[1] = 1000;
console.log(myArray.length);
myArray.sort();
console.log(myArray);

var a = 1;
var myObj  = {course1:"Javascript1",course2:"Javascript2",price:200,title:"Intro to JavaScript"};
console.log(myObj);
console.log(myObj["course"+a]);
a++;
console.log(myObj["course"+a]);
console.log(myObj.course1);