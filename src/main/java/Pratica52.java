
import utfpr.ct.dainf.if62c.pratica.*;

/**
 * @author gui_jaci@yahoo.com.br <gui_jaci@yahoo.com.br>
 */

public class Pratica52 {
    public static void main(String[] args) {
        Grade2Equation <? extends Number> eq2g;
        
        try{
            eq2g = new Grade2Equation(1,-6,8.75);
            
            try{
                System.out.println(eq2g+"\n"+eq2g.getRoot1()+"\n"+eq2g.getRoot2());
            }
            catch(NoRootsG2EquationException e){
                System.out.println(e.getMessage());
            }
            
        }
        catch(NullParAG2EquationException e){
            System.out.println(e.getMessage());
        }           
    }
}
