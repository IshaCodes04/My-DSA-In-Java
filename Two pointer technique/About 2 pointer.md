- For solving ques in interviews we must know the algorithm or patterns behind evry questions this is why we learn dsa by patter wise.

*Two Pointer Technique*

- The Two-Pointers Technique is a simple yet powerful strategy where you use two indices (pointers) that traverse a data structure—such as an array, list, or string—either toward each other or in the same direction to solve problems more efficiently.

*How to thought ki kaha two pointer use hoga?*

- Most of the ques will be on arrays and linkedlist
- But in 99% cases 2 pointer technique doesn't use in trees , graph , stack , que , dp.

*If ques is from array or linkedlist*

* then read the ques carefully find some imp points for thinks to apply 2 pointer technique ->

- Is data is sorted?
- If data is sorted then it will be advantagable or not? 
- If needed to Merge data?
- Remove duplicate / Rearranged For ex - Merge 2 array, Remove duplicate from the array  
- Remove duplicate in linkedlist , Rearranged the array ( in values)
- Detect cylce in linkedlist or if cycle is possible in ques 
- Find pairs , triplets , Quadruples
- Do not use extra space.

*What is 2 pointer*

- if 2 elements use in index of arrays or linkedlist like i or j this is knw as 2 pointers.
- Write or understand only 2 pointer are easy so that's why only 2 not 3 or 4 .
- By 2 pointer we work in coordination and for work easily.

*Two sum ques* 

- So the ques of two sum here is an array is given or target sum diya huya h now we need to find 2 number / indexes jiska sum target value ke equal ho? 

array = [2,7,11,15] , target value = 9
(2+7) = 9

* Now we find is this two sum ques is eligible for 2 pointer or not?

- Agr number return krna h toh array ko sort kr skte h :- 

* Becos after sorting numbers are same but indexes were changed 

* So the thing is that if ques return index & we sorted the array then index was changes , but if ques is asked for return number then sorting is good but if in case of indexe the sorting is not prefer (Array sort diya hoga tb already toh sort nhi krenge in case of return index).

* In that type of cases ques demands for only number then array sort kr skte h otherwise , index demanded h toh check krenge ques is  sorted or not if sorted then 2 pointer use hoga.

* Ques :-  An Unsorted array , we need to 2 numbers whose sum is equal to given target and don't use exta space? In this ques 2 pointer was used.

- [2,5,1,7,3] unsorted array 

- [1,2,3,5,7] sorted array , after sorting is allowed becos in ques return pair of numbers demanded

- i + j = 1+7 = 8 , here 8>6 acc to our target sum so idr change krenge iteration position then pointers ko ++ or -- krnege  :-

- if result is eqaul to target sum then return is otherwise we change the interation positons acc to 3 cases are :- if sum == 6 then return kr denge , if sum<6 then change iteration postion and ++  , if 8>6 then also changed iteration position and -- .

- For example :- if target sum = 20 h or 1+7 = 8 aa rha h output so 8<20 then i++ , But if 1=7 = 8 aa rha h jo 8>6 se then j-- krenge .