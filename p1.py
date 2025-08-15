
'''Write a python code using while loop to print even numbers 
   and count odd numbers from 1 to 20
'''
s = 1 

count = 0 

while (s <= 20):

    if((s % 2) == 0):
        print(s , "is Even Number")
    else:
        count = count + 1
    s = s + 1

print("Total Odd Numbers are : " , count)

