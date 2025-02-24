Two pointers :
1) Left, Right; (left ->   <-right) (reverse, two sum, greedy)
2) Slow, Fast (slow -> +1, fast -> +2) (linked list, happy number)

2-> 3-> 4-> 5-> 6-> 8-> 0

s,f
2-> 3-> 4-> 5-> 6-> 8-> 0

    s   f
2-> 3-> 4-> 5-> 6-> 8-> 0

        s       f
2-> 3-> 4-> 5-> 6-> 8-> 0

            s           f
2-> 3-> 4-> 5-> 6-> 8-> 0

Happy number :

23 = 2 and 3 = 4 + 9 = 13
1 and 3 and 0 = 1 + 9 = 10
1 and 0 = 1 + 0 = 1;

23 -> 13 -> 10 -> 1

12 :
1^2 + 2^ = 1 + 4 = 5
5^2 = 25
    = 4 + 25 = 29
    = 4 + 81 = 85
    = 64 + 25 = 89
    = 64 + 82 = 145
    = 1 + 16 + 25 = 42
    = 16 + 4 = 20
    = 4 + 0 = 4
    = 16
    = 1 + 36 = 37
    = 9 + 49 = 58
    = 25 + 64 = 89

s,f
12 -> 5-> 25-> 29-> 85-> 89-> 145-> 42-> 20-> 4-> 16-> 37-> 58->

               s                f
12 -> 5-> 25-> 29-> 85-> 89-> 145-> 42-> 20-> 4-> 16-> 37-> 58->

3) Pair (first, second) (first = 0; second = 5,first = 1; second = 8)

Task :
[H,e,l,l,o, , w, o ,r ,l,d] -  reverse string
 l                       r
[H,e,l,l,o, , w, o ,r ,l,d]

   l                   r
[d,e,l,l,o, , w, o ,r ,l,H]

     l              r
[d,l,l,l,o, , w, o ,r ,e,H]

arr = [H,e,l,l,o, , w, o ,r ,l,d];
left = 0;
right = arr.length - 1;
while(left < right) {
    temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    left++;
    right--;
}
Time complexity O(n)
Space complexity O(1)