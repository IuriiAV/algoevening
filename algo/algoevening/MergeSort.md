Merge sort :
arr = [38,27,43,3,9,82,10]

one = [1,3,5,6]
two = [2,3,4]

Merge sorted array :
[1,2,3,3,4,5,6]

result.length = one.length + two.length;
oneIndex = 0;
twoIndex = 0;
resultIndex = 0;

while(oneIndex < one.length && twoIndex < two.length) {
    oneElement = one[oneIndex]; // 1 ; 3 ; 3 ; 3 ; 5
    twoElement = two[twoIndex]; // 2 ; 2 ; 3 ; 4 ; 4
    if(oneElement < twoElement) {
       // тогда помещаем по индексу resultIndex в результирующий массив oneElement // 1 2 3 3
       // oneIndex++; //1 //2
    } else {
        // тогда помещаем по индексу resultIndex в результирующий массив twoElement // 1 2 3 3 4
        twoElement++;  //1 2 3
    }
    resultIndex++; //1 2 3 4 5
}

while(oneIndex < one.length) {
     result[resultIndex] = one[oneIndex];
     oneIndex++;
     resultIndex++;
}

while(twoIndex < two.length) {
     result[resultIndex] = two[twoIndex];
     twoIndex++;
     resultIndex++;
}


JS : arr = [38,27,43,3]
function mergeSort(arr) {
    if(arr.length === 1) {
        return arr;
    }
    let mid = Math.floor(arr.length / 2);

    let left = arr.slice(0, mid);
    let right = arr.slice(mid);

    let resLeft = mergeSort(left);
    let resRight = mergeSort(right);

    return merge(resLeft,resRight);
}

mergeSort :
{
     arr = [38,27,43,3];
     left = [38,27]
     right = [43,3]
     [27][38] = mergeSort(left) : {
                                    arr = [38,27]
                                    left = [38]
                                    right = [27]
                                    mergeSort (left): {
                                        arr = [38]
                                        return [38];
                                    }
                                    mergeSort (right): {
                                        arr = [27]
                                        return [27];
                                    }
                                    // [38][27]
                                    return [27] : [38]; // merge function
                                 }
      [3][43] = mergeSort(right) : {
                                    arr = [43,3]
                                    left = [43]
                                    right = [3]
                                    mergeSort (left) {
                                        arr = [43]
                                        return [43];
                                    }
                                    mergeSort (right) {
                                        arr = [3]
                                        return [3]
                                    }

                                    return [3][43]
                                  }

     return [3][43] : [27][38]     // merge function [3][27][38][43]
}