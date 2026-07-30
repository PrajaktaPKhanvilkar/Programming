#include<stdio.h>
#include<string.h>
#include<unistd.h>
#include<fcntl.h> // only linux based os

void WriteData(char FileName[], char Data[]){
    int fd = 0;
    int iRet =0;
    
    fd = open(FileName,O_RDWR | O_APPEND);
    if(fd == -1){
        printf("unable to Open file\n");
    }else{
        printf("File Opened successfully with fd :%d\n",fd);
        iRet= write(fd,Data,strlen(Data));
        printf("%d bytes,get successfully written\n",iRet);
        close(fd);
    }
}

int main()
{
   
    char Fname[30] = {'\0'};
    char Data[30] = {'\0'};
    printf("Enter a File Name\n");
    scanf("%[^'\n']s", Fname);
    printf("Enter a Data\n");
    scanf(" %[^'\n']s", Data);
    WriteData(Fname, Data);
    return 0;
}