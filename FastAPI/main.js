const nemo = ['Nemo'];
const large = new Array(1000).fill('nemo');
function findNemo(array){
let t0 = performance.now();
for(let i = 0; i<nemo.length; i++){
  if(nemo==='Nemo'){
    console.log('Find nemo');
  }
}
  let t1 = performance.now();
  console.log('Call to find nemo took ' + (t1-t0) +' ms');
}
// findNemo(nemo);
findNemo(large);

array = ['Nil', 'Nil', 'Nemo'];
const findNemo1 = array=> {
  for(let fish of array){
    if(fish ==='Nemo'){
      console.log("find nemo!")
    }
  }
}

findNemo1(array);

const findNemo2 = array =>{
array.forEach(fish => {
  if(fish === 'Nil'){
    console.log("Nil founnnnddd!!!")
  }
  
});
}

findNemo2(array);