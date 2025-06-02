
#include <stdio.h>
// char 문자 2개를 입력 받아서 2진수로 표현하기
// 이때, 배열을 활용한다.

int main()
{
    int arry[8];
    for (int i = 0; i < 8; i++)
    {
        arry[i] = 0;
    } // 배열 초기화

    char input;
    input = getchar();
    getchar();

    if ('A' <= input & input <= 'F')
    {
        for (int i = 3; i >= 0; i--)
        {
            arry[i] = (input - 55) & (1 << i) ? '1' : '0';
            putchar(arry[i]);
        }
        putchar('\n');
    }
    else if ('0' <= input & input <= '9')
    {
        for (int i = 3; i >= 0; i--)
        {
            arry[i] = (input - 48) & (1 << i) ? '1' : '0';
            putchar(arry[i]);
        }
        putchar('\n');
    }

    input = getchar();
    getchar();

    if ('A' <= input & input <= 'F')
    {
        for (int i = 7; i >= 4; i--)
        {
            arry[i] = (input - 55) & (1 << (i - 4)) ? '1' : '0';
            putchar(arry[i]);
        }
        putchar('\n');
    }
    else if ('0' <= input & input <= '9')
    {
        for (int i = 7; i >= 4; i--)
        {
            arry[i] = (input - 48) & (1 << (i - 4)) ? '1' : '0';
            putchar(arry[i]);
        }
        putchar('\n');
    }

    printf("최종결과 출력 : ");
    for (int i = 7; i >= 0; i--)
    {
        putchar(arry[i]);
    }
    putchar('\n');

    return 0;
}