//calloch和realloc以及free的使用

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<errno.h>

int main()
{
	//开辟一个连续的空间
	int* p = (int*)calloc(10, sizeof(int));
	if (p == NULL)
	{
		printf("%s\n", strerror(errno));
	}
	else
	{
		int i = 0;
		for (i = 0;i < 10;i++)
		{
			printf("%d ", *(p + i));
		}
	}
	printf("\n");
    //增加动态内存空间
	int* ptr = (int*)realloc(p,48);
	if (ptr != NULL)
	{
		p = ptr;	
		int i = 0;
		for (i = 0;i < 12;i++)
	    {
	       printf("%d ", *(p + i));
	    }
	}
	//手动释放
	free(p);
	p = NULL;

	return 0;

