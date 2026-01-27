// Ques :-  An Unsorted array , we need to 2 numbers whose sum is equal to given target and don't use exta space? In this ques 2 pointer was used.

// [2,5,1,7,3] unsorted array index

// [1,2,3,5,7] sorted array , after sorting is allowed becos in ques return pair of numbers demanded

// i + j = 1+7 = 8 , here 8>6 acc to our target sum so idr change krenge iteration position then pointers ko ++ or -- krnege  :-

// if result is eqaul to target sum then return is otherwise we change the interation positons acc to 3 cases are :- if sum == 6 then return kr denge , if sum<6 then change iteration postion and ++  , if 8>6 then also changed iteration position and -- .

// For example :- if target sum = 20 h or 1+7 = 8 aa rha h output so 8<20 then i++ , But if 1=7 = 8 aa rha h jo 8>6 se then j-- krenge .



public class javabasics {
  
}
