package Bai2;

import java.net.*; 
public class AllAddr
{
    public static void main(String[]args) 
    {
        try
        {
      InetAddress[] addr = InetAddress.getAllByName("www.microsoft.com");
            for (int i = 0; i < addr.length; i++)
            {
                System.out.println (addr[i]);
            }
        }
        catch (UnknownHostException ex)
        {
            System.out.println("Could not find www.microsoft.com");
        }
    }
}

