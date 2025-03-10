QuickSort :

{7, -2, 4, 1, 6, 5, 0, -4, 2}
В качестве опорного элемента - всегда будем брать последний

Опорный элемент = 2
index = 0; i = 0;
{7, -2, 4, 1, 6, 5, 0, -4, 2} ; 7 > 2 ; index = 0; i = 0;
{-2, 7, 4, 1, 6, 5, 0, -4, 2} ; -2 < 2; index ++; index = 1; i = 1;
{-2, 7, 4, 1, 6, 5, 0, -4, 2} ;  4 > 2; i = 2;
{-2, 1, 4, 7, 6, 5, 0, -4, 2} ;  1 < 2; i = 3; index++; index = 2;
{-2, 1, 4, 7, 6, 5, 0, -4, 2} ; i = 4
{-2, 1, 4, 7, 6, 5, 0, -4, 2} ; i = 5
{-2, 1, 0, 7, 6, 5, 4, -4, 2} ; i = 6; 0 < 2; index++;index = 3;
{-2, 1, 0,-4, 6, 5, 4,  7, 2} ; i = 7; -4 < 2; index++;index = 4;
{-2, 1, 0,-4, 6, 5, 4,  7, 2} ; i = 8; 2 < 2;
{-2, 1, 0,-4, 2, 5, 4,  7, 6}


JS :
function change(arr) {
let index = 0;
let value = arr[arr.length - 1];
    for(let i = 0; i < arr.length; i++) {
        if(arr[i] < value) {
           swap(arr, index, i);
           index++;
        }
    }
    swap(arr, index, arr.length-1);
}


{7, -2, 4, 1, 6, 5, 0, -4, 2}
swap(array, 2, 5);

function swap (array, index, i) {
    let temp = array[index]; // 4
    array[index] = array[i]; // 5
    array[i] = temp; // 4
}
{7, -2, 5, 1, 6, 4, 0, -4, 2}

private void swap(int[] array, int index, int i) {
    int temp = array[index];
    array[index] = array[i];
    array[i] = temp;
}

1) {7, -2, 4, 1, 6, 5, 0, -4, 2}
   index = 0;
   value = 2;
2) Поместить все элементы меньше 2 влево , используя index(в цикле)
3) Поместить элемент 2 по значению index который получится после всех перемещений


{-2, 1, 0,-4,
                 5, 4,  7, 6}
index = 0;
опорный элемент = -4
-2, 1, 0, -4 ; i = 0;
-2, 1, 0, -4 ; i = 1;
-2, 1, 0, -4 ; i = 2;
-2, 1, 0, -4 ; i = 3;

-4, 1, 0, -2

index = 0; i = 0;
value = 6;
5, 4,  7, 6 ; i = 0;  index++; index = 1;
5, 4,  7, 6 ; i = 1;  index++; index = 2;
5, 4,  7, 6 ; i = 2;
5, 4,  7, 6 ; i = 3;
5, 4,  6, 7 ;

