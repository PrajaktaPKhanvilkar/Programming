
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

int Count(PNODE head)
{
    int iCount = 0;
    while (head != NULL)
    {
        if (head->data % 2 == 0)
        {
            iCount++;
        }

        head = head->next;
    }
    return iCount;
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
    InsertFirst(&head, 51);
    InsertFirst(&head, 21);
    InsertFirst(&head, 11);
    InsertFirst(&head, 2);

    iRet = Count(head);
    printf("Count of even numbers in linked list is: %d\n", iRet);
    return 0;
}