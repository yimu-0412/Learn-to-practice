//malloc和realloc以及free的使用

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>

int main()
{
	int arr[10] = { 0 };
	int* p = (int *)malloc(40);
	if (p == NULL)
	{
		printf("内存开辟失败\n");
	}
	else
	{
		int i = 0;
		for (i = 0;i < 10;i++)
		{
			*(p + i) = 0;	
		}
		for (i = 0;i < 10;i++)
		{
			printf("%d ", p[i]);
		}
    printf("\n");
    int* ptr = (int*)realloc(p, 48);
    if (ptr != NULL)
    {
	    p = ptr;
	    int i = 0;
	    for (i = 0;i < 12;i++)
	    {
		printf("%d ", *(p + i));
	    }
    }
		free(p);
		p = NULL;
	}
	return 0;
}