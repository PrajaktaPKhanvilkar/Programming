
#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;

int LastOccurance(PNODE head, int iNo)
{
    int iPosition = 1;
    int iLastPosition = -1;
    while (head != NULL)
    {
        if (head->data == iNo)
        {
            iLastPosition = iPosition;
        }
        iPosition++;
        head = head->next;
    }
    return iLastPosition;
}


void InsertFirst(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));
    newn->data = iNo;
    newn->next = NULL;

    if (NULL == *first) // LinkList is emptty
    {
        *first = newn;
    }
    else // LL contains atleast one node
    {
        newn->next = *first;
        *first = newn;
    }
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;
    InsertFirst(&head, 101);
    InsertFirst(&head, 21);
    InsertFirst(&head, 51);
    InsertFirst(&head, 21);
    InsertFirst(&head, 11);
    InsertFirst(&head, 2);

    iRet = LastOccurance(head, 21);
    printf("Last occurance of 21 is at position: %d\n", iRet);
    return 0;
}