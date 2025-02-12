Task one:

Time complexity :
Space complexity :

JS:
function sum(one, two) {
    let result = one + two;
    return result;
}
1 + 1 = O(2) = O(1)

Java:
private static int sum(int one, int two) {
    int result = one + two;
    return result;
}

Time complexity : O(1)
Space complexity : O(1)


Task two:

Time complexity : O(n)
Space complexity : O(1)

function calculate(array) {
    let result = 0; // 1
    for(let i = 0; i < array.length; i++) { // i = 0 //1, i < array.length // 1 * n, i++ //1 * n
        result = result + array[i]; // 1 * n
    }
    return result; // 1
}
Time complexity = 1 + 1 + n + n + n + 1 = 3 + 3n = 3n = O(n)

public static int calculate(int[] array) {
    int result = 0;
     for(int i = 0; i < array.length; i++) {
            result = result + array[i];
     }
     return result;
}

Task three :

Time complexity :
Space complexity :

function calculate(array) {
    let result = 0;  // 1
    for(let i = 0; i < array.length; i++) { // 1, n, n
        result = result + array[i]; // n
    }

    for(let i = 0; i < array.length; i++) {  //1 , n , n
            result = result - array[i]; // n
    }

    return result; // 1
}
O(1) + O(1) + O(n) + O(n) + O(n) + O(1)  + O(n) + O(n) + O(n)+ O(1) = O(4) + O(6n) = O(n)
public static int calculate(int[] array) {
     int result = 0;
     for(int i = 0; i < array.length; i++) {
            result = result + array[i];
     }

     for(int i = 0; i < array.length; i++) {
                 result = result - array[i];
     }
     return result;
}

function calculate(array) {
    let result = 0;  // 1
    for(let i = 0; i < array.length; i++) { // 1, n , n
           for(let j = 0; j < array.length; j++) {  //n , n * n , n * n
                   result = result - array[j];  // n * n
           }
    }
    return result; // 1
}
1 + 1 + n + n + n + n^2 + n^2 + n^2 + 1 = 3 + 3n + 3n^2 = n + n^2 = n ^ 2
public static int calculate(int[] array) {
     int result = 0;
     for(int i = 0; i < array.length; i++) {
          for(int j = 0; j < array.length; j++) {
                           result = result - array[j];
          }
     }
     return result;
}