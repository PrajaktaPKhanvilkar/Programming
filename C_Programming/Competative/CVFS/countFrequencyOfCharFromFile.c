#include <stdio.h>
#include <unistd.h>
#include <fcntl.h> 
#include<string.h>

#define BUFFER_SIZE 1024
#define ERR_OPEN -1

int CountCharFrequency(char FileName[], char cName){
    char Buffer [BUFFER_SIZE] = {'\0'};
    int iRet =0,fd =0, iCount =0;
    fd=open(FileName,O_RDONLY);
    if(fd== -1){
        return ERR_OPEN;
    }
    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0){
        for(int i =0;i<iRet;i++){
            if(Buffer[i] == cName){
                iCount = iCount + 1;
            }
        }
        memset(Buffer,'\0',sizeof(Buffer));
    }
    return iCount;
    close(fd);
}
int main()
{
   
    char Fname[30] = {'\0'};
    char cValue ='\0';
    int iRes = 0;
     printf("Enter a File Name\n");
    scanf("%[^'\n']s", Fname);
     printf("Enter the Character you want to search\n");
    scanf("%s", cValue);
    iRes = CountCharFrequency(Fname,cValue);
    if(iRes == ERR_OPEN){
        printf("Ubale to Open File\n");
    }else{
        printf("Frequency of Letter in file is: %d\n",iRes);
    }
    
    return 0;
}