/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 *
 * @author Dell
 */
public class InterfaceLister {
    public static void main(String[] args) throws Exception {
Enumeration interfaces = NetworkInterface.getNetworkInterfaces( );
while (interfaces.hasMoreElements( )) {
   NetworkInterface ni = (NetworkInterface) interfaces.nextElement(
     );
System.out.println(ni);
       }
    }

}
