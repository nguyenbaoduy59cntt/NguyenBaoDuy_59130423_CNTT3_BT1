/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continue_;

/**
 *
 * @author Admin
 */
public class MainActivity {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++)
        {
            if(i%3!=0) //Nếu điều kiện này đúng thì lệnh continue sẽ bỏ qua câu lệnh bên dưới.
                continue;
                System.out.println(""+i);
        }
    }
}
