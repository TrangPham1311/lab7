package Bai1;

import java.net.*;
class myAddress 
{
    public static void main (String args[]) 
    {
        try 
        {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Hello. My name is " + address.getHostName() + " and my IP adress is " + address.getHostAddress());
        }
        catch (UnknownHostException e) 
        {
            System.out.println("I don't know my own name and address.");
        }
    }
}
