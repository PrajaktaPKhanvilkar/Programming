#include <stdio.h>
#include <unistd.h>
#include <fcntl.h> 
#include<string.h>

#define BUFFER_SIZE 1024

int CountCapital(char FileName[]){
    char Buffer [BUFFER_SIZE] = {'\0'};
    int iRet =0,fd =0, iCount =0;
    fd=open(FileName,O_RDONLY);
    if(fd== -1){
        printf("unable to open file \n");
        return -1;
    }
    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0){
        for(int i =0;i<iRet;i++){
            if(Buffer[i]>= 'A' && Buffer[i]<= 'Z'){
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
    iRes = CountCapital(Fname);
    printf("Capilat Letters in file is: %d\n",iRes);
    return 0;
}