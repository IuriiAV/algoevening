Binary Search :
           0   1    2   3   4   5   6    7    8    9
arr[] = {->11, 22, 44, 50, 60, 86, 114, 140, 145, 190 <-}, x = 114

    //определяем левый и правый индексы
    left = 0;  // 0
    right = arr.length - 1;  // 9

    //запускаем цикл пока индексы не встретятся или не найдем элемент
    while(left <= right) {

        //находим индекс серединного элемента
        mid = left + (right - left) / 2;   // right + left / 2   // 4 ; 5 + (9 - 5) /2 = 7
                                           // 5 + (6 -5) /2 = 5; // 6 + (6-6) / 2 = 6

        //получили элемент по индексу mid
        element = arr[mid]; // arr[4] = 60, arr[7] = 140, arr[5] = 86, arr[6] = 114

        //сравниваем элемент с тем что ищем
        if(element === x) { // 60 != 114; 140 != 114; 86!=114; 114 === 114
            //если нашли элемент то УПС и ОК!
            return mid;  // 6
        }

        //Проверяем где искать слева или справа
        if(element < x) {
            //значит нам нужно искать в правой части от серединного
            left = mid + 1; // 5; 6
        } else {
            //значит на нужно искать в левой части от серединного
            right = mid - 1; 7 -1 = 6;
        }
     }

