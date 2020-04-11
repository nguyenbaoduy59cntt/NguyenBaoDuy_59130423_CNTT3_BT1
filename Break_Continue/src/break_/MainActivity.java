/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package break_;

/**
 *
 * @author Admin
 */
public class MainActivity {
    public static void main(String[] args) {
        int n=10;
        for(int i=0; i<=n;i++)
        {
            System.out.println("Hien tai la so "+i);
            if(i==9)
                break;
        }
    }
}
