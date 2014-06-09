package utfpr.ct.dainf.if62c.pratica;

/**
 * @author Guilherme Jacichen   <gui_jaci@yahoo.com.br>
 */
public class NoRootsG2EquationException extends RuntimeException{
    private final Grade2Equation eq;
    
    public NoRootsG2EquationException(Grade2Equation eq){
        super("This equation doesn't have any roots.");
        this.eq = eq;
    }
    
    public Grade2Equation getG2Equation(){
        return eq;
    }
}
