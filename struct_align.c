//结构体的内存对齐

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
struct S1
{
	double a;
	char b;
	int c;
};
struct S2
{
	char d;
	struct S1 s;
	double e;
};
int main()
{
	printf("%d\n", sizeof(struct S2));
	return 0;
}