#include <stdio.h>
#include <unistd.h>
#include <fcntl.h> 
#include<string.h>

#define BUFFER_SIZE 1024

void DisplayFIle(char FileName[], int iNo){
    char Buffer [BUFFER_SIZE] = {'\0'};
    int iRet =0,fd =0 ;
    fd=open(FileName,O_RDONLY);
    if(fd== -1){
        printf("unable to open file \n");
        return;
    }
    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0){
         for(int i =0;i<iRet;i++){
            if(i!=iNo){
               write(1,Buffer,iRet);
            }
        }
        memset(Buffer,'\0',sizeof(Buffer));
    }
    close(fd);
}
int main()
{
    
    

    printf("Enter a File Name\n");
    char Fname[30] = {'\0'};
    int iValue;
    scanf("%[^'\n']s", Fname);
    printf("Enter the Number of Char to be Displayed");
    scanf("%d",iValue);

    DisplayFIle(Fname, iValue);
    return 0;
}