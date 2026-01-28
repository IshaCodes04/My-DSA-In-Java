Ques.167 :- *Two sum ques* 

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