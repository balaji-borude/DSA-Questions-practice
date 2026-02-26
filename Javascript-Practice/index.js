// Basic Promise Example 

// Promise is the object that represents the eventual completion (or failure) of an asynchronous operation, and its resulting value.

// const promise = new Promise((resolve,reject)=>{
//     const result = true;

//     if(result){
//         resolve("Success");
//     }else{
//         reject("Promise Rejected");
//     }
// });

const promise = new Promise((resolve,reject)=>{
    resolve("Success");
   
})

.then(()=>{console.log("Promise Fulfilled ")})
.catch(()=>{console.log("Promise Rejected ")});


// ASync and await 

async function test() {
  return 5;
};

let result =   test();
console.log(result); // it return Promise by default

// but when we use await keyword it return the value directly
let result2 = await test();
console.log(result2);


// use of await keyword
async function getData() {
  const result = await Promise.resolve("Hello");
  console.log(result);
}

getData();


// Debouncing 

