//结构体的嵌套

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
struct S
{
	int a;
	int b;
	double d;
};
struct B
{
	char c;
	struct S s;
	short ss;
};

int main()
{
	struct B b = { "a",{100,200,3.14},5 };
	printf("%4f\n", b.s.d);
	return 0;
}
