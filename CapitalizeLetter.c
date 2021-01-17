#include<stdio.h>
int main()
{
    int i;
    int length = 0;
    char word[100];
    // printf("Enter string : ");
    gets(word);
    length = strlen(word);
    
    for(i=0; i<length; i++){
        if(i==0 || i==length-1)
        {
            word[i] = toupper(word[i]);
        }
        else if(word[i] == ' ')
        {
            word[i-1] = toupper(word[i-1]);
            word[i+1] = toupper(word[i+1]);
        }
    }
    
    printf("\n %s",word);
    return 0;
}
