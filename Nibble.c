#include <stdio.h>
// char 문자 1개를 4bit(nibble)로 변환시키는 코드
// [ ] [ ] [ ] [ ]
// 4bit로 표현 가능한 문자는 0 ~ 15이다. (0~9,a,b,c,d,e,f)
int main()
{
    char c, word = 'a';
    char some;
    int nibble;

    printf("char 'a' = %c(0x%x)\n", word, word);

    c = "0123456789abcdef"[word & 0x0f];
    printf("and row nibble is = %c\n", c);

    c = "0123456789abcdef"[word >> 4];
    printf("and upper nibble is = %c\n", c);

    for (int i = 7; i >= 0; i--)
    { // 각 비트를 출력
        putchar((word & (1 << i)) ? '1' : '0');
    }
    printf("\n\n --------여기까지 ASCII-------------\n\n");
    some = getchar();

    if ('A' <= some & some <= 'F')
    {
        printf("input val = %d\n", some - 55);

        for (int i = 7; i >= 0; i--)
        {
            putchar(10 & (1 << i) ? '1' : '0');
            if (i == 4)
                putchar('|');
        }
        putchar('\n');
    }
    return 0;
}