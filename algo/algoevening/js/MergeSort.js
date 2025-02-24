////////////////////////////////////////////////////////////
let one = [1, 3, 5, 6];
let two = [2, 3, 4];

let res = merge(one, two);
console.log(`Array is ${res}`);

function merge(one, two) {
    let result = [];
    let oneIndex = 0;
    let twoIndex = 0;

    while(oneIndex < one.length && twoIndex < two.length) {
        let oneElement = one[oneIndex];
        let twoElement = two[twoIndex];
        if(oneElement < twoElement) {
            result.push(oneElement);
            oneIndex++;
        } else {
            result.push(twoElement);
            twoIndex++;
        }
    }
    while(oneIndex < one.length){
        result.push(one[oneIndex]);
        oneIndex++;
    }
    while(twoIndex < two.length) {
        result.push(two[twoIndex]);
        twoIndex++;
    }
    return result;
}

let arr = [38,27,43,3,9,82,10];
let sortedArray = mergeSort(arr);
console.log(`Sorted array is ${sortedArray}`);

function mergeSort(arr) { ////38,27,43,3  // 38 27 // 38
    if(arr.length === 1) {
        return arr;
    }

    //находим середину нашего массива
    let mid = Math.floor(arr.length / 2);
    // создать два новых массива с (0 до mid - 1) и с (mid до array.length - 1)
    let left = arr.slice(0, mid); //38,27,43,3  // 38 27 // 38 // 43
    let right = arr.slice(mid); // 9,82,10    //  43 3 // 27  // 3

    let resLeft = mergeSort(left); //38,27,43,3 // 38 27 // 38 // 43
    // 38 // 27 38 // 43

    let resRight = mergeSort(right);// 27 // 43 3 // 3
    // 27 //3

    return merge(resLeft,resRight); // 27 38 ->

}