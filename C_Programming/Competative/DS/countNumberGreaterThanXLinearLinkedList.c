
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

void Display(PNODE first)
{
    while (first != NULL) //  Type 1
    {
        printf("| %d | -> ", first->data);
        first = first->next;
    }
    printf("NULL\n");
}

int Count(PNODE head, int iNo)
{
    int iCount = 0;
    while (head != NULL)
    {
        if (head->data > iNo)
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
    int iValue = 0;
    InsertFirst(&head, 101);
    InsertFirst(&head, 51);
    InsertFirst(&head, 2);
    InsertFirst(&head, 21);
    InsertFirst(&head, 11);
    InsertFirst(&head, 2);

    Display(head);

    printf("Enter the number to search: \n");
    scanf("%d", &iValue);
    iRet = Count(head, iValue);
    printf("Count of numbers greater than %d in linked list is: %d\n", iValue, iRet);
    return 0;
}