#include <stdio.h>
#include <unistd.h>
#include <fcntl.h> 
#include<string.h>

#define BUFFER_SIZE 1024

int CalculateFileSize(char FileName[]){
    char Buffer [BUFFER_SIZE] = {'\0'};
    int iRet =0,fd =0, iSize =0;
    fd=open(FileName,O_RDONLY);
    if(fd== -1){
        printf("unable to open file \n");
        return -1;
    }
    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0){
        iSize = iSize + iRet;
        memset(Buffer,'\0',sizeof(Buffer));
    }
    return iSize;
    close(fd);
}
int main()
{
    printf("Enter a File Name\n");
    char Fname[30] = {'\0'};
    int iRes = 0;
    scanf("%[^'\n']s", Fname);
    // DisplayFIle(Fname);
    iRes = CalculateFileSize(Fname);
    printf("Size of file is: %d\n",iRes);
    return 0;
}