#include <stdio.h>
#include <unistd.h>
#include <fcntl.h> 
#include<string.h>

#define BUFFER_SIZE 1024
#define ERR_OPEN -1

int CountSmall(char FileName[]){
    char Buffer [BUFFER_SIZE] = {'\0'};
    int iRet =0,fd =0, iCount =0;
    fd=open(FileName,O_RDONLY);
    if(fd== -1){
        return ERR_OPEN;
    }
    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0){
        for(int i =0;i<iRet;i++){
            if(Buffer[i]== ' '){
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
    printf("Enter a File Name\n");
    char Fname[30] = {'\0'};
    int iRes = 0;
    scanf("%[^'\n']s", Fname);
    iRes = CountSmall(Fname);
    if(iRes == ERR_OPEN){
        printf("Ubale to Open File\n");
    }else{
        printf("Small Letters in file is: %d\n",iRes);
    }
    
    return 0;
}