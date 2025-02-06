package naru;
import mathematics.*;
import pack1.*;
import pack2.*;
public class sk
{
public static void main(String[] args)
{
student s=new student();
s.accept1();
s.accept2();
college cg=new college();
cg.accept();
sk sk =new sk();
System.out.println("student Name:"+s.sn);
System.out.println("student Roll no:"+s.sr);
System.out.println("student percentage:"+s.sp);
System.out.println("course Name:"+s.nc);
System.out.println("duration:"+s.cd);
System.out.println("college name:"+cg.cn);
System.out.println("college id:"+cg.ci);

}
}