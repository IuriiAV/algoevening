
let n = 1;

console.log(`Iterate approach`);
for(let i = 1; i <=5; i++) {
    console.log(`${i}`);
}

console.log(`Recurrent approach`);
printDigit(n);

function printDigit(n) {
    //base case
    if(n === 6) {
        return;
    }
    //recurrent case
    console.log(`${n}`);
    printDigit(n + 1);
}

let k = 5;

console.log(`Recurrent reverse approach`);
printDigitReverse(k);

// 5 , 4, 3, 2, 1
function printDigitReverse(k) {
    //base case 
    if(k === 0) {
        return;
    }
    console.log(`${k}`);
    printDigitReverse(k-1);
}

console.log(`Recurrent reverse approach two`);
printDigitReverseTwo(k);
// 1 2 3 4 5
function printDigitReverseTwo(k) { //5 // 4 //3 
    //base case 
    if(k === 0) {
        return;
    }
    printDigitReverseTwo(k-1); // 5-1, 4-1, 
    console.log(`${k}`);
}

let a = 5;
console.log(`${sumIteration(a)}`);

function sumIteration(a) {
    let sum = 0;
    for(let i = 1; i<=a; i++) {
        sum = sum + i;
    }
    return sum;
}

let arr = [11, 22, 44, 50, 60, 86, 114, 140, 145, 190];
let x = 114;

console.log(`Index 114 is ${binarySearch(arr,x)}`);
//Time complexity O(log n)
//Space complexity O(1)
//Если вы видите алгоритм, в котором, в каждой итерации цикла 
//исходные данные делятся пополам и потом берется в работу одна из половин
//то сложность такого алгоритма Time complexity = O(log n)
function binarySearch(arr,x) {
    let left = 0;
    let right = arr.length - 1;
    while(left <= right) {
        let mid = Math.floor((left + right) / 2);
        let element = arr[mid];
        if(element === x) {
            return mid;
        }  
        if(element < x) {
            left = mid + 1;
        }  else {
            right = mid - 1;
        }
    }
    return - 1;
}

let left = 0;
let right = arr.length - 1;
x = 10;
console.log(`Index recursievly ${x} is ${recursionBinarySearch(arr,left,right,x)}`);
console.log(`End `);

function recursionBinarySearch(arr, left, right, x) {
    let mid = Math.floor((left + right) / 2);
    let element = arr[mid];

    //base case 
    if(element === x) {
        return mid;
    }  
    if(left > right) {
        return -1;
    }

    if(element < x) {
        left = mid + 1;
    }  else {
        right = mid - 1;
    }

    return recursionBinarySearch(arr, left, right, x);

}
arr = [0,1,2,3,4,5,10,9,8,7,6]; 
console.log(`Peak is  ${getPeak(arr,0,arr.length - 1)}`);
console.log(`End `);
function getPeak(arr, left, right) {
    let mid = Math.floor((left + right) / 2);

    if(arr[mid - 1] < arr[mid] && arr[mid]> arr[mid+1]) {
        return arr[mid];
    }

    if(arr[mid-1] < arr[mid] && arr[mid] <arr[mid+1]) {
        return getPeak(arr, mid + 1, right);
    } else {
        return getPeak(arr,left, mid - 1);
    }

}

people = [10, 55, 70, 20, 90, 85];
let limit = 100;
console.log(`Number boats is  ${getNumberOfBoats(people,limit)}`);
function getNumberOfBoats(people, limit) {
        people.sort((a,b)=>a-b);  // O(n logn)
        let left = 0;
        let right = people.length - 1;
        let boat = 0;
        // {10, 20, 55, 70, 85, 90};
        let currentWeight = 0;
        while (left <= right) {  //n
            currentWeight = people[left] + people[right]; // 90 + 10 , 20 + 85, 90
            while (currentWeight <= limit && left < right) { //n
                  left ++;  // 1(20)//2(55)
                  currentWeight = currentWeight + people[left]; //110, 145
            }
            boat ++; //1//2//3
            right--; //4 (85)// 3 (70), //2 (55)
        }

        return boat;

    // Time complexity O(n logn) + O(n) = O(n logn)
    // Space complexity = O(1) ,
}

let str =  "abeccdeba";
console.log(`Is palindrome abeccdeba  ${isPalindrome(str)}`);
function isPalindrome(str) {
    let left = 0;
    let right = str.length - 1;
    while (left < right) {
        let l = str[left];
        let r = str[right];
        if (l == r) {
            left++;
            right--;

        } else {
            return check(str, left + 1, right) || check(str, left, right - 1);
        }
    }
    return true;
}

function check(str, left, right) {
    while (left < right) {
        if (str[left++] !== str[right--]) {
            return false;
        }
    }
    return true;
}