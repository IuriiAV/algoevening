// 5 , 4, 3, 2, 1
function printDigitReverse(k) {
    if(k === 0) {
        return;
    }
    console.log(`${k}`);
    printDigitReverse(k-1);
}

{  // k = 3;
   if(k === 0) return;
   // print 3

   { // k = 2;
     if(k === 0) return;
     //print 2

     { // k = 1
       if(k === 0) return;
       //print 1

       {// k = 0
         if(k === 0) return;
       }
     }
   }
}


// 1 2 3
function printDigitReverseTwo(k) {
    if(k === 0) {
        return;
    }
    printDigitReverseTwo(k-1); // 5-1, 4-1,
    console.log(`${k}`);
}


{ // k == 3
     if(k === 0) return;
     { // k == 2
          if(k === 0) return;
          { // k == 1
               if(k === 0) return;
               { // k == 0
                    if(k === 0) return;
               }
               //print 1
          }
          // print 2
     }
     // print 3
}