#include <stdio.h>

int main(void) {
	int n , x, y, z;
	int sum = 0;
	scanf("%d",&n);
	while(n>0){
	    scanf("%d %d %d ", &x, &y, &z);
	    sum = x+y+z;
	    if(sum-x == x || sum-x == y || sum-x == z || sum-y == x || sum-y == y || sum-y == z || sum-z == x || sum-z == y || sum-z == z)
	    {
	        printf("YES\n");
	    }
	    else{
	        printf("NO\n");
	    }
	    sum = 0;
	    n--;
	}
	return 0;
}

