- For solving ques in interviews we must know the algorithm or patterns behind evry questions this is why we learn dsa by patter wise.

*Two Pointer Technique*

- The Two-Pointers Technique is a simple yet powerful strategy where you use two indices (pointers) that traverse a data structure—such as an array, list, or string—either toward each other or in the same direction to solve problems more efficiently.

*How to thought ki kaha two pointer use hoga?*

- Most of the ques will be on arrays and linkedlist
- But in 99% cases 2 pointer technique doesn't use in trees , graph , stack , que , dp.

*If ques is from array or linkedlist*

* then read the ques carefully find some imp points for thinks to apply 2 pointer technique ->

- Is data is sorted
- If data is sorted then its will be easy 
- If needed to Merge data 
- Remove duplicate / Rearranged For ex - Merge 2 array, Remove duplicate from the array  
- Remove duplicate in linkedlist , Rearranged the array ( in values)
- Detect cylce in linkedlist or if cycle is possible in ques 
- Find pairs , triplets , Quadruples

*What is 2 pointer*

- if 2 elements use in index of arrays or linkedlist like i or j this is knw as 2 pointers.
- Write or understand only 2 pointer are easy so that's why only 2 not 3 or 4 .
- By 2 pointer we work in coordination and for work easily.

*Two sum ques* 

- So the ques of two sum here is an array is given or target sum diya huya h now we need to find 2 number / indexes jiska sum target value ke equal ho? 

array = [2,7,11,15] , target value = 9
(2+7) = 9

*Now we find is this two sum ques is eligible for 2 pointer or not?*

- Read ques carefully :- 

* Ques mein pair given krna h so one click is this ki ques 2 pointer ka ho skta h 
* If ques mein number or index return krna h (2,7) or (0,1)

- So for find two pointer Condition for two sum ques is ki array ka ques h but not sorted , what if we sorting the array then check it is useful or not?

- So agr ques is demanded for simple number then array ko sort kr skte h because after sorting an array number doesn't changed 

- But agr ques is demaned for indexes then array ko sort nhi krenge becos after sorting indexes are changed 

* In that type of cases if ques demand for simple number then array sort krna h if it demands for index then check if array is already sorted or not , if its sorted then 2 pointer technique lgegi , if not sorted then nhi krna h result glt ayega becos of changes in indexes 






