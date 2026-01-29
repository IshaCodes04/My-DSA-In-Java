Ques.26 :- *Remove duplicates from sorted array*

* Acc to flowchart ques is from array , array is already sorted , removed duplicates , In order / no space, so in this ques we use two pointer.

- [1,1,1,2,2,3,3] So we have an array with duplicates element in it , array is sorted

- [1,2,3 , ....] So first we need to re-arrange array with unique numbers which only appear once in place of duplicate element then baki aage kch bhi likh skte h hum 

* How to find any duplicate element in an array

- [1,1,1,2,2,3,3] so here we can clearly see array is already sorted that's why all element ek he line m h 

- [1] jo first element h woh already unique number h.

- Ab array sorted h so sare elements ek jaise dikhenge, duplicate kaise find krenge? if any element is same from their adjacent/left element then it was duplicated , if adjacent element was not same then its unique number.

- no. of unique numbers = first 1 is already unique , when we find another unique number then ++ kr denge 

- [1,1,1,2,2,3,3] so ab kya krna h 1 pe pointer h already jo 0th index h if adjacent element same h jo ++ pointer pass on kr denge next element pe , but if adjacent element diff hoga then 0 + 1 kr denge next index pe pointer add kr denge 1th pe , or unique number mein ++ kr denge 1 + 1 = 2 or 2 new unique number aa jyega. [1,2,1,2,2,3,3] , or (n-1) ke liye ek pointer every step pe pass on hota rhega for check adjacent elements
 

