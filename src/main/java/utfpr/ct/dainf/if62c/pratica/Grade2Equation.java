package utfpr.ct.dainf.if62c.pratica;

/**
 * @author Guilherme Jacichen   <gui_jaci@yahoo.com.br>
 */

/**
 * @param <N1>
 */
public class Grade2Equation <N1 extends Number> {
    private N1 a, b, c;
    
    /**
     * @param a 
     * @param b
     * @param c
     * @throws utfpr.ct.dainf.if62c.pratica.NullParAG2EquationException
     */
    public Grade2Equation (N1 a, N1 b, N1 c) throws NullParAG2EquationException{
        if(a.doubleValue() == 0)
            throw new NullParAG2EquationException();
        this.a = a;
        this.b = b;
        this.c = c;
    }
   
    public N1 getAPar(){
        return a;
    }
    
    public N1 getBPar(){
        return b;
    }
    
    public N1 getCPar(){
        return c;
    }
    
    public void setAPar(N1 a) throws NullParAG2EquationException{
        if(a.doubleValue() == 0)
            throw new NullParAG2EquationException();
        this.a = a;
    }
    
    public void setBPar(N1 b){
        this.b = b;
    }
    
    public void setCPar(N1 c){
        this.c = c;
    }
    
    public double getRoot1() throws NoRootsG2EquationException{
        if(getDelta() >= 0)
            return (Math.sqrt(getDelta()) - b.doubleValue())/(2*a.doubleValue());
        else 
            throw new NoRootsG2EquationException(this);
    }
        
    public double getRoot2() throws NoRootsG2EquationException{
        if(getDelta() >= 0)
            return -(Math.sqrt(getDelta()) + b.doubleValue())/(2*a.doubleValue());
        else 
            throw new NoRootsG2EquationException(this);
    }
    
    public boolean haveOneRoot(){
        if(getDelta() == 0)
            return true;
        else 
            return false;
    }
    
    protected double getDelta(){
        return Math.pow(b.doubleValue(),2) - 4*a.doubleValue()*c.doubleValue();
    }
}
