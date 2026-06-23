#include<stdio.h>
#include<stdbool.h>
void  DisplaySchedule(char ch){
    if(ch==65){
        printf("Your exam is at: 7 AM \n ");
    }else if(ch==66){
         printf("Your exam is at: 8:30 AM \n");
    }
    else if(ch==67){
         printf("Your exam is at: 9:20 AM \n");
    }
    else if(ch==68){ 
        printf("Your exam is at: 10:30 AM \n");
    }else{
        printf("Enter Corret Division\n");
    }
}

int main(){
    char cValue = '\0';
    printf("Enter your division\n");
    scanf("%c",&cValue);
    DisplaySchedule(cValue);
       
    return 0;
}