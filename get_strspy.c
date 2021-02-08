#include <stdio.h> 
#include <string.h>
char *strcpy(char *a, char *b)
{
	if (NULL == a || NULL == b)
		return NULL;
	char *temp = a;
	while ((*a++ = *b++) != '\0');
    return temp;
}
int strlen(char *a)
{
   int len=0;
   for (len=0; *a!='\0'; a++)
         len++;
   return len;  
}
int strlen(char *s)
{
	char *p = s;
	while (*s != '\0')
		s++;
	return s - p;
}
int strlen (char *s)
{
    int len=0;
    for (int i=0; ; i++)
    {
    if (s[i]=='\0')
    break;
    len++;
    }
    return len;
}

void foo(void)
{
	char string[10], str1[10];
	int j;
	for (j = 0; j<9; j++)
	{
		str1[j] = 'a';
	}
	str1[j] = '\0';
	strcpy(string, str1);
	int len = strlen(string);
	printf("%s", string);
	printf("\n%d", len);
}
int main()
{
	foo();
	char ch[8] = "0123456";
	char ch[8]={'0','1','2','3','4','5','6','\0',};
	printf("\n%d\n", strlen(ch));
	while (1);
	return 0;
}
