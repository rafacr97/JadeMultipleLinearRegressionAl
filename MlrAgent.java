/**
 * @author Rafae Camacho Roldán <za18012202@zapopan.tecmm.edu.mx>
 */
import jade.core.*;
import jade.core.behaviours.*;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.JOptionPane;


    public class MlrAgent extends Agent{
        protected void setup(){
            System.out.println("Agent "+getLocalName()+" stared!");
            addBehaviour(new MlrBehaviour());
        }
        
    public class MlrBehaviour extends Behaviour {
        boolean end = false;
        
        
        public void action(){
          DecimalFormat df = new DecimalFormat("#.00");
          Scanner in = new Scanner(System.in);  
          Crammer c = new Crammer();
          
          System.out.println("y =  B0 + B1x1 + B2x2");
          System.out.println("Y = "+df.format(c.beta0)+" + "+df.format(c.beta1)+"*X1"+" + "+df.format(c.beta2)+"*X2");
          
            System.out.println("Type x1:");
            Double data1 =Double.parseDouble(JOptionPane.showInputDialog("Type X1: "));
            System.out.println("Type x2:");
            Double data2 =Double.parseDouble(JOptionPane.showInputDialog("X2: "));
                
          System.out.println("Y = "+df.format(c.predict(c.beta0, c.beta1, c.beta2, data1, data2)));
          end = true;
        }
    
    
    public boolean done(){
           if(end==true){
                return true;
           }else{
                return false;
           }
       }
       
        public int onEnd() {
            myAgent.doDelete();
        return super.onEnd();
        } 
    }
}
