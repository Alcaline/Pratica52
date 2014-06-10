package utfpr.ct.dainf.if62c.pratica;

/**
 * @author Guilherme Jacichen   <gui_jaci@yahoo.com.br>
 */
public class NoRootsG2EquationException extends RuntimeException{
    private final Grade2Equation eq2g;
    
    public NoRootsG2EquationException(Grade2Equation eq2g){
        super(String.format("Equation %s doesn't have any roots.", eq2g));
        this.eq2g = eq2g;
    }
    
    public Grade2Equation getG2Equation(){
        return eq2g;
    }
}
