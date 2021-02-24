//求一个整数存储在内存中的二进制中1的个数
//代码1

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{

	int num = 1;
	int i = 0;
	int count = 0;//计数
	for (i = 0; i < 32; i++)
	{
		if (((num >> i) & 1) == 1)
			count++;
	}
	printf("二进制中1的个数 = %d\n", count);
	return 0;
}


//代码2

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int num = -1;
	int i = 0;
	int count = 0;//计数
	while (num)
	{
		count++;
		num = num & (num - 1);
	}
	printf("二进制中1的个数 = %d\n", count);
	return 0;
}