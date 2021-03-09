//反向输出一个四位数

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int n = 0;
	scanf("%d", &n);//1234
	//输入
	while (n != 0)
	{
		printf("%d", n % 10);
	    n = n / 10;
	}
	return 0;
}