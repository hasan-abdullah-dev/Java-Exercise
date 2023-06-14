#import numpy as np
def mergeLineup(pokemon_1, pokemon_2):
    myArr = [0,0,0,0,0,0,0]
    i=0
    while i<=len(pokemon_1)-1:
        j=len(pokemon_2)-1
        while j>=0:
            myArr[i]=pokemon_1[i]+pokemon_2[j]
            j-=1
            i+=1#i=4

    return myArr

print("///  Test 03: Merge Lineup  ///")
pokemon_1 = [12, 3, 25, 1, 0]
pokemon_2 = [5, -9, 3, 0, 0] 
returned_value =mergeLineup(pokemon_1, pokemon_2)
print(f'Task 3: {returned_value}') # This should print [12, 3, 28, -8, 5]