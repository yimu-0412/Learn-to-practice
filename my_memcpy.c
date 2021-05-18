//模拟实现库函数memcpy
//复制限定长度的字符串

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<assert.h>
void* my_memcpy(char* dst, const char* src, size_t count)
{
	char* ret = dst;
	assert(dst);
	assert(src);
	//从低地址复制到高地址
	while (count--)
	{
		* dst = * src;
		dst ++;
		src ++;
	}
	return(ret);
}

struct {
	char name[40];
	int age;
} person, person_copy;
int main()
{
	char myname[] = "Pierre de Fermat"; 
    //复制姓名
	my_memcpy(person.name, myname, strlen(myname) + 1);
	person.age = 46;
	//复制年龄
	my_memcpy(&person_copy, &person, sizeof(person));
	printf("person_copy: %s, %d \n", person_copy.name, person_copy.age);
	return 0;
}