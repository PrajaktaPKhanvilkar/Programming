#include <stdio.h>
#include <string.h>
#include <unistd.h>
#include <fcntl.h> // only linux based os
void openFile(char FileName[])
{
int fd = 0;
    fd = creat(FileName,0777);
    if(fd == -1){
        printf("unable to create file\n");
    }else{

        printf("File created successfully with fd :%d\n",fd);
    }
}
int main()
{
    char Fname[30] = {'\0'};
    printf("Enter a File Name\n");
    scanf("%[^'\n']s", Fname);
    openFile(Fname);
    return 0;
}