public class CmdArguments {
    public static void main(String[] args)
    {
        System.out.println("There are "+args.length+" elements in array");
        for(int i=0; i<args.length; i++)
        {
            System.out.println(i+1+":- "+args[i]);
        }
    }
}