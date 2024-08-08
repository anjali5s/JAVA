// class Demo
// {
// public static void main(String []args)
// {
// System.out.println(args[0]);
// }
// }

// class Demo
// {
// public static void main(String []args)
// {
// for(int i=0;i<args.length;i++)
// System.out.println(args[i]);
// }
// }

// class Demo
// {
// public static void main(String []args)
// {
// int s=0;
// for(int i=0;i<=args.length;i++)
// s=s+i;
// System.out.println(s);
// }
// }

class Demo
{
public static void main(String []args)
{
    int s=0;
for(int i=0;i<args.length;i++)
s=s+Integer.parseInt(args[i]);
System.out.println(s);
}
}