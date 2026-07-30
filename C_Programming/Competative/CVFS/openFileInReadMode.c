#include <stdio.h>
#include <string.h>
#include <unistd.h>
#include <fcntl.h> // only linux based os
void openFile(char FileName[])
{

    int fd = 0;
    int iRet = 0;
    char Data[100] = {"\0"};
    fd = open(FileName, O_RDONLY);
    if (fd == -1)
    {
        printf("unable to Open file\n");
    }
    else
    {
        printf("File Opened successfully with fd :%d\n", fd);
        iRet = read(fd, Data, 13);
        close(fd);
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