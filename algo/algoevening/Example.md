
[H,e,l,l,o, , w, o ,r ,l,d]

[d,l,r,o,w, , o, l ,l ,e,h]

Brute force :
[                         ]

[                   l  e H]

Two pointers :

left = 0; right = arr.length - 1;
l                        r
[H,e,l,l,o, , w, o ,r ,l,d]

l = H, r = d;
    l                   r
[d, e,l,l,o, , w, o ,r ,l,H]
l=e, r = l
       l              r
[d, l, l,l,o, , w, o ,r ,e,H]