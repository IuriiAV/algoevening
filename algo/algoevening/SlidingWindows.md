Sliding windows :
Array [1,3,2,6,-1,4,1,8,2]
length subarray = 5;

(1 + 3 +2 +6 + -1) / 5   = 2.2
3,2,6,-1,4
-1,4,1,8,2
2,6,-1,4,1
6,-1,4,1,8

index = array.length - 5;

for( i = 0; i <= index; i++) {
    sum = 0;
    for(j = i; j <= i + 4;j++) {
        sum = sum + array[j];
    }
    print sum / 5 ;
}

Array [1,3,2,6,-1,4,1,8,2]
1  3  2  6  -1
   3  2  6  -1  4
      2  6  -1  4   1
         6  -1  4   1   8
            -1  4   1   8   2

sum = 0;
start = 0;
k = 5;
for(i = 0; i < array.length; i++) {
    sum = sum + array[i];
    if(i >= k - 1) { // i = 4,5,6,7,8,9
       print sum / 5 ;
       sum = sum - array[start];
       start++;
    }
}

//Array [2,1,5,1,3,2]
//найти максимальную сумму элементов подмассива длинной 3
2 1 5 = 8
1 5 1  = 7
5 1 3  = 9 Максимальная сумма
1 3 2 = 6


//
Array [2,1,5,2,3,2]  sum = 7;
Найти минимальную длину подмассива, сумма которого больше или равна sum

2
2 1
2 1 5 = 8
2 1 5 2 = 10
1
1 5
1 5 2 = 8
1 5 2 3 = 11
5
5 2 = 7
5 2 3 = 10

for() {
    подсчет суммы
    while (sum >= 7) {
           length subarray - вычислить длину подмассива и
           сравнить с минимальной
           sum = sum - array[start];
           start++;
    }
}

//
Array [1,0,1,1,0,1,1]
1
11
1
1,1,1,1,0,1,1
1,0,1,1,1,1,1
// Найти максимальную длину единичек если можно перевернуть только один 0 в 1

max = 0;
start = 0;
zero = 0;
for(i = 0; i < arr.length; i++) {  // 1,0,1,1,0,1
     if(arr[i] === 0) {
            zero++;
     }
     while(zero > 1) {
        if(arr[start] === 0) {
            zero--;
        }
        start++;
     }

    currMax = i - start + 1;
    if(currMax > max) {
        max = currMax;
    }
}

max = Math.max(max, i - start + 1);