#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n,i;
    long long f[52];
    f[1]=1;
    f[2]=2;
    while(scanf("%d",&n)!=EOF)
    {
        for(i=3;i<=n;i++)
        {
            f[i]=f[i-1]+f[i-2];
        }
        printf("%lld\n",f[n]);
    }
    return 0;
}
