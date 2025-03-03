let s = ["H","e","l","l","o"," ","W","o","r","l","d","!"];
console.log(`Reveresed string is ${reverseString(s)}`);
function reverseString(s) {
    let left = 0;
    let right = s.length - 1;
    while(left < right) {
        let temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
    }
    return s;
}

let numbers = [0, 1, 2, 4, 5, 7, 11, 15];
let target = 9;
findIndex(numbers, target);
function findIndex(numbers, target) {
    let left = 0;
    let right = numbers.length - 1;
    while(left < right) {
        let sum = numbers[left] + numbers[right];
        if(sum === target) {
            console.log(`index 1 = ${left} , index 2 = ${right}`);
            break;
        }
        if(sum > target) {
            right--;
        } else {
            left ++;
        }
    }
}

let numb = [-4,-1,0,3,10];
console.log(`squares of array = ${getSquaresOfArray(numb)}`);

function getSquaresOfArray(numb) {
    let result = [];
    let index = numb.length - 1;

    let left = 0;
    let right = numb.length - 1;

    while (index >= 0) {
     let sL = numb[left] * numb[left];
     let sR = numb[right] * numb[right];
     if(sL > sR) {
         result[index] = sL;
         left ++;
      } else {
          result[index] = sR;
          right--;
      }
      index--;

    }
    return result;
}

let nums = [0, 1, 2, 3, 2, 0, 4, 2];
let remove = 2;
removeElements(nums,remove);

function removeElements(nums, remove) {
    let slow = 0;

    for(let fast = 0; fast < nums.length; fast++) {
        if(nums[fast]!=remove) {
            nums[slow] = nums[fast];
            slow++;
        }
    }

    for(let i = slow; i<nums.length; i++) {
        nums[i] = -1;
    }
    console.log(`array = ${nums}  , count = ${slow}`);
}
//Time complexity O(n)