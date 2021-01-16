#include <stdio.h>

int main(void) {
	// your code goes here
	int t;
	int sum = 0;
	int n, i, digit;
	scanf("%d",&t);
	for(i=0; i<t; i++)
	{
	    scanf("%d",&n);
	    while(n!=0)
	    {
	        digit = n%10;
	        sum = sum + digit;
	        n = n/10;
	    }
	    printf("%d\n",sum);
	    sum = 0;
	}
	return 0;
}

