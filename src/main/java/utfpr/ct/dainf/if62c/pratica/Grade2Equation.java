package utfpr.ct.dainf.if62c.pratica;

import java.text.DecimalFormat;

/**
 * @author Guilherme Jacichen   <gui_jaci@yahoo.com.br>
 */

/**
 * @param <N>extends Number>
 */
public class Grade2Equation <N extends Number> {
    private N a, b, c;
    
    /**
     * @param a 
     * @param b
     * @param c
     * @throws utfpr.ct.dainf.if62c.pratica.NullParAG2EquationException
     */
    public Grade2Equation (N a, N b, N c) throws NullParAG2EquationException{
        if(a.doubleValue() == 0)
            throw new NullParAG2EquationException();
        this.a = a;
        this.b = b;
        this.c = c;
    }
   
    public N getAPar(){
        return a;
    }
    
    public N getBPar(){
        return b;
    }
    
    public N getCPar(){
        return c;
    }
    
    public void setAPar(N a) throws NullParAG2EquationException{
        if(a.doubleValue() == 0)
            throw new NullParAG2EquationException();
        this.a = a;
    }
    
    public void setBPar(N b){
        this.b = b;
    }
    
    public void setCPar(N c){
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
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        DecimalFormat f = new DecimalFormat("#.##");
        
        if(a.doubleValue() != 1)
            s.append(f.format(a.doubleValue()));
        s.append("x² ");
        
        if(b.doubleValue() > 0)
            s.append("+");

        if(b.doubleValue() != 0){
            if(b.doubleValue() != 1)
                    s.append(f.format(b.doubleValue()));
            s.append("x ");
        }
        
        if(c.doubleValue() > 0)
            s.append("+");
        
        if(c.doubleValue() != 0)
                s.append(f.format(c.doubleValue()));
        
        s.append(" =0");

        return s.toString();
    }
}
