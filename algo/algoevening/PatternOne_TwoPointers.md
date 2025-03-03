Two pointers :
1) Left, Right; (left ->   <-right) (reverse, two sum, greedy)
2) Slow, Fast (slow -> +1, fast -> +2) (linked list, happy number)

LEFT , RIGHT
1)Reverse string
2)Two sum
3)Squares of arrays

1) Task :
[H,e,l,l,o, , w, o ,r ,l,d] -  reverse string
 l                       r
[H,e,l,l,o, , w, o ,r ,l,d]

   l                   r
[d,e,l,l,o, , w, o ,r ,l,H]

     l              r
[d,l,l,l,o, , w, o ,r ,e,H]
Time complexity O(n)

2) Two sum (sorted array)
numbers = [0,1,2,4,5,7,11,15]; target = 9; index1 = 2, index2 = 5;
0 -> 1 , 2, 4, 5, 7, 11 ,15
1 -> 2+1, 1 +4, 1+5 etc
2 -> 2+4, 2 + 5, 2+7

 l               r
[0,1,2,4,5,7,11,15]
1: 15 + 0 = 15 , 15 = 9 ? ;  15 > 9 r--; // (6 < 9)  l ++;

 l           r       (l+r)
[0,1,2,4,5,7,11,15]; 11 > 9; r--

l          r
[0,1,2,4,5,7,11,15]; 7 > 9 ; 7 < 9 ; l++;

   l       r
[0,1,2,4,5,7,11,15]; 1 + 7 < 9 ; l++

     l     r
[0,1,2,4,5,7,11,15]; 2+7 = 9 Hurraa
Time complexity O(n)

//ascending order - по возрастанию (1,3,5,6,7,8,9,14,19)
//non-decreasing order -  в не убывающем порядке (1, 3, 4 , 4, 4, 5, 5, 6 ,7,8)

3) Squares of sorted array (non-decreasing order)
numbers = [-4,-1,0,3,10];

Squares = [16,1,0,9,100]  -> [0,1,9,16,100]
  l        r
[16,1,0,9,100] 16 < 100
result = [ , , , ,100]; r--;

  l     r
[16,1,0,9,100] 16 > 9 ; l++
result = [ , , , 16,100];

    l   r
[16,1,0,9,100] 1 < 9; r--
result = [ , , 9, 16,100];

    l r
[16,1,0,9,100] 1 > 0; l++
result = [ , 1, 9, 16,100];

     lr
[16,1,0,9,100] 0 > 0; l++
result = [0, 1, 9, 16,100];

numbers = [-10, - 7, -3, 1, 2, 3, 9, 11]
numbers = [100, 49, 9, 1, 4, 81, 121]

SLOW, FAST
1) Remove element

numbers = [3,2,2,3]  , remove = 3 ;
numbers = [2,2,_,_] , return 2

numbers = [0,1,2,2,2,3,2,0,4,2] remove = 2;
numbers = [0,1,3,0,4,_,_,_,_,] return 5


s,f
[0, 1, 2, 2, 2, 3, 2, 0, 4, 2]

sf
[0, 1, 2, 2, 2, 3, 2, 0, 4, 2] if(numbers[f] != 2) numbers[s] = numbers[f], s =0; f =0; s++, f++;

    sf
[0, 1, 2, 2, 2, 3, 2, 0, 4, 2] if(numbers[f] != 2) numbers[s] = numbers[f], s =1; f =1; s++, f++;

       sf
[0, 1, 2, 2, 2, 3, 2, 0, 4, 2] if(numbers[f] == 2)  f = 2; f++;

       s  f
[0, 1, 2, 2, 2, 3, 2, 0, 4, 2] if(numbers[f] == 2)  f = 3; f++;

       s     f
[0, 1, 2, 2, 2, 3, 2, 0, 4, 2] if(numbers[f] == 2)  f = 4; f++;

       s        f
[0, 1, 3, 2, 2, 3, 2, 0, 4, 2] if(numbers[f] != 2)  numbers[s] = numbers[f]; s =2; s++; f = 5; f++

          s        f
[0, 1, 3, 2, 2, 3, 2, 0, 4, 2] if(numbers[f] == 2)  f = 6; f++

          s           f
[0, 1, 3, 0, 2, 3, 2, 0, 4, 2] if(numbers[f] != 2)  numbers[s] = numbers[f]; s = 3; s++; f = 7; f++

             s           f
[0, 1, 3, 0, 4, 3, 2, 0, 4, 2] if(numbers[f] != 2)  numbers[s] = numbers[f]; s = 4; s++; f = 8; f++

                s           f
[0, 1, 3, 0, 4, 3, 2, 0, 4, 2] if(numbers[f] != 2)  numbers[s] = numbers[f]; s = 4; s++; f = 8; f++


2) Remove duplicates   -  HomeWORK!!!!!!!!!!
numbers = [1,1,2]
numbers = [1,2,_]

numbers = [0,0,1,1,1,1,2,2,3,4,5,5]
numbers = [0,1,2,3,4,5,_,_,_,_,_,_]

slow = 0;
fast = 1;