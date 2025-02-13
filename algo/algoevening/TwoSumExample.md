Two sum :

[2, 3, 5, 7, 9, 15]  - sorted array

Найти индексы двух элементов сумма которых = 10
1000 * 1000
for( i = 0; i < arr.length; i ++) {
    one = arr[i]; // 2, 3
    for ( j = i + 1; j < arr.length; j ++) {
        two = arr[j]; //2:  3, 5 , 7 , 9, 15 // 3: 5,7
        sum = one + two;
        if(sum === 10) {
            Hurraaaa!
        }
    }
}
    l     r
[2, 3, 5, 7, 9, 15]   // 1000

while ( l < r) {
    one = arr[l];
    two = arr[r];
    sum = one + two; // 2 + 15 , 2 + 9 , 2 + 7, 3 + 7
    if(sum === 10) {
        Hurraaaa!
        break;
    }
    if(sum > 10) { // 2 + 15 > 10
        r--;
    } else {
        l++;
    }

}