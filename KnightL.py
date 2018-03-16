# Enter your code here. Read input from STDIN. Print output to STDOUT


import sys

def initialize(n):

    a = [[sys.maxsize for i in range(n)] for j in range(n)]

    return a

       

def reachable(a,i,j,p_i,p_j):

        if ((i+p_i>=0 and i+p_i <len(a)) and (j+p_j>=0 and j+p_j <len(a))):

                return True

        else:

                return False

       

def search(a,prox_list):

        queue = [(0,0,)]

        a[0][0]=0

        visited = [[False for i in range(len(a))] for j in range(len(a))]

        while len(queue) > 0:

                temp = queue[0]

                del queue[0]

                for i in range(len(prox_list)):

                        if (reachable(a,temp[0],temp[1],prox_list[i][0],prox_list[i][1])) and (visited[temp[0]+prox_list[i][0]][temp[1]+prox_list[i][1]]== False):

                                queue.append((temp[0]+prox_list[i][0],temp[1]+prox_list[i][1],))

                                if a[temp[0]+prox_list[i][0]][temp[1]+prox_list[i][1]] > a[temp[0]][temp[1]]+1:

                                        a[temp[0]+prox_list[i][0]][temp[1]+prox_list[i][1]] = a[temp[0]][temp[1]]+1

                                        visited[temp[0]+prox_list[i][0]][temp[1]+prox_list[i][1]] = True

 
        res = a[len(a)-1][len(a)-1] if a[len(a)-1][len(a)-1]!=sys.maxsize else -1
        return (res)       

def KnightL(a,b,n):
    prox_list = [[-1*a,-1*b],[-1*a,b],[a,-1*b],[a,b],[-1*b,-1*a],[-1*b,a],[b,-1*a],[b,a]]
    mat = initialize(n)
    return search(mat,prox_list)
    
    

if __name__=="__main__":
    n = int(input())
    for i in range(1,n):
        for j in range(1,n):
            print(KnightL(i,j,n),end = " ")

        print("\n")
            
            

        
        
        
        

        
    
    
        
    
    
    
    
    
    
    
    
                    
                
            
            
            
            
            
            
    
