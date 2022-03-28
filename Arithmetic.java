/**
 * @author Rafae Camacho Roldán <za18012202@zapopan.tecmm.edu.mx>
 */

import java.util.*;
public class Arithmetic extends DataSet{
    double result=0.0;
    double n=x1_array.length;
    
    double sumX1i(double []x1_array){
        double result=0.0;
        for(int i=0;i<x1_array.length;i++){
            result+=x1_array[i];
        }
        return result;
    }
    
    double sumX2i(double []x2_array){
        result=0.0;
        for(int i=0;i<x2_array.length;i++){
            result+=x2_array[i];
        }
        return result;
    }
    
    double sumX1i_2(double []x1_array){
        result=0.0;
        for(int i=0;i<x1_array.length;i++){
            result+=Math.pow(x1_array[i],2);
        }
        return result;
    }
    
    double sumX1iX2i(double []x1_array, double []x2_array){
        result=0.0;
        for(int i=0;i<x1_array.length;i++){
            result+=x1_array[i]*x2_array[i];
        }
        return result;
    }
    
    double sumX2i_2(double []x2_array){
        result=0.0;
        for(int i=0;i<x2_array.length;i++){
            result+=Math.pow(x2_array[i],2);
        }
        return result;
    }
    
    double sumYi(double []y_array){
        result=0.0;
        for(int i=0;i<y_array.length;i++){
            result+=y_array[i];
        }
        return result;
    }
    
    double sumX1iYi(double []x1_array, double []y_array){
        result=0.0;
        for(int i=0;i<x1_array.length;i++){
            result+=x1_array[i]*y_array[i];
        }
        return result;
    }
    
    double sumX2iYi(double []x2_array, double []y_array){
        result=0.0;
        for(int i=0;i<x2_array.length;i++){
            result+=x2_array[i]*y_array[i];
        }
        return result;
    }
}
