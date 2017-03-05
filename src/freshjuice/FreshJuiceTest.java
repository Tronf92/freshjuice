/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package freshjuice;

class FreshJuice{
    enum FreshJuiceSize{SMALL, MED, LARGE}
    FreshJuiceSize size;
}
public class FreshJuiceTest {

    
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice. FreshJuiceSize.MED;
        System.out.println("Size: " + juice.size);
    }
    
}
