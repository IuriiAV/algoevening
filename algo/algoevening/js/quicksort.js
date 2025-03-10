let arr = [7, -2, 4, 1, 6, 5, 0, -4, 2];
quickSort(arr, 0, arr.length - 1);

console.log(`array = ${arr}`); 

function quickSort(arr, start ,end) {
    if(start < end) {
        let index = change(arr, start, end);
        quickSort(arr, 0, index - 1);
        quickSort(arr, index + 1, end);
    }
}

function change(arr, start, end) {
    let index = start;
    let value = arr[end];
    for (let i = start; i <= end - 1; i++) {
        if (arr[i] < value) {
            let temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            index++;
        }
    }

    let temp = arr[index];
    arr[index] = arr[end];
    arr[end] = temp;
    return index;
}