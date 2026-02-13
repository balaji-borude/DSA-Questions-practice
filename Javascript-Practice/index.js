// Basic Promise Example 


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

// console.log(promise);