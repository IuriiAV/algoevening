Task :
[1,7,3,6,5,6]
[2, 1, -1]  0 = 1 - 1
Найти индекс элемента, для которого сумма элементов слева равна
сумме элементов справа,
решения может не быть , поэтому верните индекс -1

correct answer index = 3;
1 + 7 + 3 = 5 + 6

index 0 , value 1 :  0 !=  7 + 3 + 6 + 5 + 6
index 1 , value 7 :  1 != 3 + 6 + 5 + 6
index 2 , value 3 :  1 + 7 != 6 + 5 + 6
index 3 , value 6 :  1 + 7 + 3 = 5 + 6

n + n + n^2 + n^2 + n = 3n + 2n^2 = n + n^2 = O(n ^ 2)
for( i = 0; i < array.length; i++) {

    left = 0; // n
    right = 0; // n

    //n * n
    for(j = 0; j < i; j++) {
        left = left +  array[j]
    }

    //n * n
    for(k=i +1 ; k < array.length; k++) {
        right = right + array[k]
    }

    //n
    if(left == right) {
        return i;
    }
}