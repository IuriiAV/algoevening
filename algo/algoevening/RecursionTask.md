n = 5;
1 + 2 + 3 + 4 + 5 = 15

let sum = 0;
for(let i = 1; i <= n; i++) {
   sum = sum + i;
}

function sumRecursion(n) { // 5 , 4 , 3 , 2, 1
    //base case
    if(n === 1) {
        return 1;
    }

    //recurrent case
    let previousResult = sumRecursion(n - 1);

    let sum = n + previousResult;
    return sum;
}

{ // n = 5
     if(n === 1) return 1;
     let previousResult = { // n = 4
                              if(n === 1) return 1;
                               let previousResult =  { // n = 3
                                                      if(n === 1) return 1;
                                                      let previousResult =  {// n = 2
                                                                               if(n === 1) return 1;
                                                                               let previousResult = {// n = 1
                                                                                                        if(n === 1) return 1;
                                                                                                    }
                                                                                let sum = 2 + 1;
                                                                                return sum; // 3
                                                                           }
                                                      let sum = 3 + 3; // 6
                                                      return sum; // 6
                                                  }
                              let sum = 4 + 6; // 10
                              return sum; // 10
                         }
     let sum = 5 + 10; // 15
     return sum; // 15
}
