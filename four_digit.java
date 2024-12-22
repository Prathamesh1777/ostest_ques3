

public class four_digit{

public static void main(String[] args) {

int num=0;

for(int i=0;i<9999;i++)
{
if(i%10==0 && i%13==0)
{
    num=i;
}



}

System.out.println(num);

}
}