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

// JS Array Function

// . map()

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let sum = 0;
const newArr = arr.map((item) => (sum = item + sum));
console.log(newArr); // [1, 3, 6, 10, 15, 21, 28, 36, 45, 55]

// calculate the sum of the array emelemnt

// for each --> do not return anything it always show the Undefiend
// let sum =0;
const totalSum = arr.forEach((ele) => (sum = sum + ele));
console.log(totalSum);

// .reduce()
const result = arr.reduce((accumulator, current) => accumulator + current, 0);
console.log("sum of all the elemenet in an array -->", result);

//.filter();

const data = [
  {
    title: "what is the best programming language",
    content: "javascript is the best programming language",
  },
  {
    title: "is React the best framework?",
    content: "React is the best framework",
  },
  {
    title: "what is the best framework?",
    content: "Angular is the best framework",
  },

  {
    title: "Next js is the good framework?",
    content: "for the people who are not using React",
  },
];

// This is good for the sigle word filter not for multiple word --> use trim()
const searchWord = "javascript";

const searchResult = data.filter(
  (item) =>
    item.title.toLocaleLowerCase().includes(searchWord.toLocaleLowerCase()) ||
    item.content.toLocaleLowerCase().includes(searchWord.toLocaleLowerCase()),
);
console.log(searchResult);



// for the multiple word searching 


const searchPattern = "javascript framework";

const keywords = searchPattern.toLowerCase().trim().split(" ");

const searchData = data.filter((item) => {
  const text = `${item.title} ${item.content}`.toLowerCase();

  return keywords.some((word) => text.includes(word));
});

console.log("for multiple keyword searching -->", searchData);




// Debouncing 

// const apiCall = async()=>{
//   console.log("Api is called ");

//   return 1;
// };

// const timerId = setTimeout(apiCall,6000);
// console.log("Debounce applied to the api called ", timerId);


const apiCall = async () => {
  console.log("API is called");
};

const debouncedApiCall = debounce(apiCall, 2000);

// simulate multiple triggers
debouncedApiCall();
debouncedApiCall();
debouncedApiCall();