// you are required to complete this function 
// function should print the required range
void findSmallestRange(int arr[][N], int n, int k)
{ 
    int l=0,r=0;
    int pre_max =0;
    int pre_min=0;
    int right_index = n-1;
    int left_index = 0;
  while(right_index >left_index)
  {
    int left_max = INT_MIN;
    int right_min = INT_MAX;
    for(int i=0;i<k;i++)
    {
        if(arr[i][left_index]>left_max)
        left_max = arr[i][0];
    }
    
    for( int i=0;i<k;i++)
    {
        if(arr[i][right_index] < right_min)
        right_min = arr[i][right_index];
    }
    for(int i=0;i<k;i++)
    {
        
        if(left_max == right_min)
        {
            l = left_max;
            r = right_min;
            break;
        }
        if(left_max > right_min)
        {
            int opt1 = pre_min-left_max;
            int opt2 = right_min-pre_max;
            if(opt1 <= opt2)
             {
                 l = left_max;
                 r = pre_min;
             }
             else
             {
                 l = pre_max;
                 r = right_min;
             }
             break;
        }
        if(left_max < right_min)
        {
            pre_min= right_min ;
        }
          pre_max = left_max;
          pre_min = right_min;
    }
    right_index--;
    left_index++;
    
  }
  cout<<l<<" "<<r;
  cout<<"\n";
}