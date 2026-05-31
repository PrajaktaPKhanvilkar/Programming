#include <stdio.h>
#include <stdbool.h>

bool CheckVowel(char cValue){
    if(cValue == 'A' || cValue == 'E' || cValue == 'I' || cValue == 'O' || cValue == 'U' ||
       cValue == 'a' || cValue == 'e' || cValue == 'i' || cValue == 'o' || cValue == 'u'){
        return true;
    }
    else{
        return false;
    }
}

 int main(){
    char cValue = 0;
    bool bFlag = false;
    printf("Enter Character: \n");
    scanf("%c",&cValue);
    bFlag = CheckVowel(cValue);
    if(bFlag == true){
        printf("Character is a Vowel\n");
    }
    else{
        printf("Character is not a Vowel\n");
    }
    return 0;
 }