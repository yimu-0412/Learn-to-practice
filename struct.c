//结构体struct练习

#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
struct Stu
{
	char name[20];
	int age;
	char sex[5];
	char id[10];
}s1, s2;
struct Stu s1 = { "张三", 18, "男", "205" };
struct Stu s2 = { "李四", 18, "男", "206" };
//传值
void print1(struct Stu s)
{
	printf("name=%s\n age=%d\n sex=%s\n id=%s\n", s.name, s.age, s.sex, s.id);
	printf("\n");
}
//传址
void print2(struct Stu* s)
{
	//方式1
	printf("name=%s\n age=%d\n sex=%s\n id=%s\n", (*s).name, (*s).age, (*s).sex, (*s).id);//
	printf("\n");
	//方式2
	printf("name=%s\n age=%d\n sex=%s\n id=%s\n", s->name, s->age, s->sex, s->id);
	printf("\n");
}
int main()
	{

	print1(s1);
	print1(s2);
	print2(&s1);
	print2(&s2);
	return 0;
}