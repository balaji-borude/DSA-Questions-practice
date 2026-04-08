// Hoisiting --> Hoisting is the default behaviour of the Js Engine where all the  variables and function declaration are moved to the top of the scope before the code execution.

// variable hoisting with var
console.log(a); // undefined
a = 2;

var a; // this is hoisted to the top and set the value of a  to -->  undefined

// variable hoisting with let and const
// console.log(b); // ReferenceError: Cannot access 'b' before initialization
// where let and const are hoisted to top but not ininitilized and they are in temporal dead zone until the line where they are initialized. so we cannot access them before initialization.
// console.log(b);

// let b;
// b=3;

// Higher Oeder function

function func() {
  console.log("Hello World");
}

function func2(action) {
  console.log("Pringting from the higher order function");
  action();
  action();
}
func2(func);

// .map() , .filter(), .reduce(), .forEach(), .find(), .some() , .every() --> are the POPULAR Highere order function
