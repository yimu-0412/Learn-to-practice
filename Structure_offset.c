//offsetof的作用显示

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stddef.h>
struct S1
{
	double a;
	char b;
	int c;
};
int main()
{
	//计算的是结构体成员相对于结构体起始位置的偏移量
	printf("%d\n",offsetof(struct S1,a));
	printf("%d\n", offsetof(struct S1, b));
	printf("%d\n", offsetof(struct S1, c));
	return 0;
}