package utfpr.ct.dainf.if62c.pratica;

/**
 * @author Guilherme Jacichen   <gui_jaci@yahoo.com.br>
 */
public class NullParAG2EquationException extends RuntimeException{
  
    public NullParAG2EquationException(){
        super("Cannot have a 2o Grade Equation with parameter a = 0.");

    }
}
