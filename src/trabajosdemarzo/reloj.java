/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajosdemarzo;

/**
 *
 * @author ITS LOJA
 */
public class reloj {
    public static void main(String args[]) {
		int h=0;
		int m=0;
		int s=0;
		while (h<=23) {
			System.out.println(h+":"+m+":"+s);
			s = s+1;
			if (s==60) {
				m = m+1;
				s = 0;
			}
			if (m==60) {
				h = h+1;
				m = 0;
			}
		}
	}
}
