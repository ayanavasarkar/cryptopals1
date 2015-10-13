/**
 *
 * @author AYANAVA SARKAR
 */
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.math.*;
public class lol {
    public static void main (String[] args) throws java.lang.Exception
	{
		String h1 = "1c0111001f010100061a024b53535009181c";
  		BigInteger bi=new BigInteger(h1,16);
                System.out.println(bi);
                String binary1 = bi.toString(2);
                String binary="000"+binary1;
                System.out.println(binary);
                
                String h2 = "686974207468652062756c6c277320657965";
  		BigInteger bi2=new BigInteger(h2,16);
                String binary21 = bi2.toString(2);
                String binary2="0"+binary21;
                System.out.println(binary2);
                
                
                int len1=binary.length();
  		int len2=binary2.length();
                System.out.println(len1);
  		String res="";
  		if(len1>len2)
  		{
  			for(int i=0;i<len2;i++)
  			{
  				char c1=binary.charAt(i);
  				char c2=binary2.charAt(i);
  				res=res+(c1^c2);
  			}
  			
  		}
  		else
  		{
  			for(int i=0;i<len1;i++)
  			{
  				char c1=binary.charAt(i);
  				char c2=binary2.charAt(i);
  				res=res+(c1^c2);
                                
  			}
  			
  		}
  		System.out.println(res);
                System.out.println(new BigInteger(res, 2).toString(16));
                //String bin = Long.toHexString(Long.parseLong(res,2));
                //System.out.println(bin);
	}
    
}
