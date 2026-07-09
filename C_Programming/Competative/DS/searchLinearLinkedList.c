// check weather the number is present in the linked list or not
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

struct node
{
    int data;
    struct node *next;
};


typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void Display(PNODE first)
{
    while (first != NULL) //  Type 1
    {
        printf("| %d | -> ", first->data);
        first = first->next;
    }
    printf("NULL\n");
}

bool search(PNODE head, int iNo)
{
    bool bRet = false;
    while (head != NULL)
    {
        if (head->data == iNo)
        {
            bRet = true;
        }
        head = head->next;
    }
    return bRet;
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
    bool bRet = false;
    int iValue = 0;
    InsertFirst(&head, 101);
    InsertFirst(&head, 51);
    InsertFirst(&head, 21); 
    InsertFirst(&head, 11);

    Display(head);

    printf("Enter the number to search: \n");
    scanf("%d", &iValue);

    bRet = search(head, iValue);
    if (bRet == true)
    {
        printf("Element is present in linked list\n");
    }
    else
    {
        printf("Element is not present in linked list\n");
    }

    return 0;
}