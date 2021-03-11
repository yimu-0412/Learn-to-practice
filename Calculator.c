//枚举实现计算器功能

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
enum Option
{
	EXIT,
	ADD,
	SUB,
	MUL,
	DIV
};

void menu()
{
	printf("*********************************\n");
	printf("****  1. add       2. sub   *****\n");
	printf("****  3. mul       4. div   *****\n");
	printf("****  0. exit               *****\n");
	printf("*********************************\n");
}

int Add(int x, int y)
{
	return x + y;
}
int Sub(int x, int y)
{
	return x - y;
}
int Mul(int x, int y)
{
	return x * y;
}
int Div(int x, int y)
{
	return x / y;
}

int main()
{
	enum Option input = EXIT;
	
	int x = 0;
	int y = 0;
	do
	{
		menu();
		printf("请选择:>");
		scanf("%d", &input);
		switch (input)
		{
		case ADD:
			printf("请输入2个操作数:>");
			scanf("%d%d", &x, &y);
			printf("%d\n", Add(x, y));
			break;
		case SUB:
			printf("请输入2个操作数:>");
			scanf("%d%d", &x, &y);
			printf("%d\n", Sub(x, y));
			break;
		case MUL:
			printf("请输入2个操作数:>");
			scanf("%d%d", &x, &y);
			printf("%d\n", Mul(x, y));
			break;
		case DIV:
			printf("请输入2个操作数:>");
			scanf("%d%d", &x, &y);
			printf("%d\n", Div(x, y));
			break;
		case EXIT:
			printf("退出程序\n");
			break;
		default:
			printf("选择错误\n");
			break;
		}
	} while (input);
	return 0;
}