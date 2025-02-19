Valid palindrome :

exampleOne = "racecar"; racecar,racecar - true
exampleTwo = "abeccdeba", abecceba - true
exampleThree = "abcdef",  - false

1<str.length<=10^5
str consist of lowercase English letters

l                       r
r   a   c   e   c   a   r
    l               r
r   a   c   e   c   a   r
        l       r
r   a   c   e   c   a   r
            lr
r   a   c   e   c   a   r

l                               r
a   b   e   c   c   d   e   b   a
    l                       r
a   b   e   c   c   d   e   b   a
        l               r
a   b   e   c   c   d   e   b   a

            l       r
a   b   e   c   c   d   e   b   a

            l                       r
a   b   e   c   d   a   f   f   a   d   e   b   a

            l                       r
a   b   e   c   a   f   f   a   c   d   e   b   a



left = 0;
right = str.length - 1;

while(left < right)  {
     l = str[left];
     r = str[right];
     if( l === r) {
         left++;
         right --;

     } else {

        return check(str, left+1, right) || check(str, left, right-1);

     }

}

return true;

function check(str, left, right) {
    while(left < right) {
        if(str[left] !== str[right]) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}