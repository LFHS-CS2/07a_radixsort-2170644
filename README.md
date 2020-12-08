[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3793411&assignment_repo_type=AssignmentRepo)
Radix Sort Using Queues


Consider using a Radix Sort to order a list of positive integers. A Radix Sort makes as many passes through the list as there are digits in the largest number to be sorted. For example, if the largest integer in the list were 492, then the algorithm would make three passes through the list to sort it.

In each pass through the list, the Radix Sort algorithm sorts the numbers based on a different digit, working from the least to the most significant digit. To do this, it uses an intermediate data structure, ques, an array of ten queues. Each number is placed into the queue corresponding to the value of the digit being examined. For example, in the first pass the digit in the one&#39;s place is considered, so the number 345 would be enqueued into ques[5]. The number 260 would be enqueued into ques[0]. In each pass, the algorithm moves the numbers to be sorted from the list to the array of queues and then back to the list, as described below. After the last pass, the integers are in order, from smallest to largest.

Radix Sort Algorithm: In each pass through the list, do the following two steps.

Step 1

Taking each integer in the list in order, insert the integer into the queue corresponding to the value of the digit currently being examined. If the integer being examined does not have a digit at a given place value, 0 is assumed for that place value. For example, 95 has no digit in the hundred&#39;s place, so, when examining the hundred&#39;s digit, the algorithm would assume the value in the hundred&#39;s place is zero and enqueue 95 into ques[0].

Step 2

After all integers have been inserted into the appropriate queues, each queue is emptied in order into the array, starting with ques[0].

For example, assume that array nums contains the integers 380, 95, 345, 382, 260, 100, and 492. The sort will take three passes, because the largest integer in the array has 3 digits. The following diagram shows the sorting process. (For Pass II and III, only the non-empty queues are shown in order to save space.)

![radix_example](https://user-images.githubusercontent.com/28961298/101299943-81437c00-37f9-11eb-95b8-f19240c70fc7.jpg)

(a) Complete method itemsToQueues. itemsToQueues corresponds to Step 1 of each pass of the Radix sort algorithm, creating the intermediate array of ten queues. Each integer in list L is inserted into the queue corresponding to the value of the digit currently being examined. If an integer does not have a digit at the given place value, 0 is assumed for that place value.

In writing itemsToQueues,you may call method getDigit which returns the kth digit of its parameter, number.The least-significant digit is indicated by a value of 0 for k. If k is greater than the number of digits in number, then getDigit returns 0.

(b) Complete method queuesToArray. queuesToArray corresponds to Step 2 of each pass of the Radix sort algorithm, creating a new list from the values in the intermediate array of queues.

(c) Complete method sort.  In writing sort,you may should call methods getDigit, itemsToQueues, and queuesToArray.
