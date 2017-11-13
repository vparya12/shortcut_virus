/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gunday;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import javax.swing.JOptionPane;
/**
 *
 * @author Er. Ved Prakash Arya
 */
public class IPAddress {
         public static void main(String args[]) throws Exception
   {
      InetAddress Ip = InetAddress.getLocalHost();
       JOptionPane.showMessageDialog(null, Ip);
       String IP="49.138.241.245";
       URL link = new URL("http://freegeoip.net/"+IP);

        BufferedReader in = new BufferedReader(new InputStreamReader(link.openStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null){
        System.out.println(inputLine);             
        }

in.close();
       
      // System.out.println(InetAddress.getLocalHost());
   }
    
}
