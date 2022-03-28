/**
 * @author Rafae Camacho Roldán <za18012202@zapopan.tecmm.edu.mx>
 */

import java.util.*;

public class Crammer extends Arithmetic{
    
    double determinantSystem = (n                 * sumX1i_2(x1_array)            * sumX2i_2(x2_array))                + 
                                (sumX1i(x1_array)   * sumX1iX2i(x1_array,x2_array)  * sumX2i(x2_array))                +
                                (sumX2i(x2_array)   * sumX1i(x1_array)              * sumX1iX2i(x1_array,x2_array))
                                -
                                (sumX2i(x2_array)  * sumX1i_2(x1_array)            * sumX2i(x2_array))                 -
                                (n                  * sumX1iX2i(x1_array,x2_array)  * sumX1iX2i(x1_array,x2_array))    -
                                (sumX2i_2(x2_array) * sumX1i(x1_array)              * sumX1i(x1_array));
    
    double determiantBeta0 = (sumYi(y_array)   * sumX1i_2(x1_array)             * sumX2i_2(x2_array))               +
                             (sumX1i(x1_array) * sumX1iX2i(x1_array,x2_array)   * sumX2iYi(x2_array,y_array))       +
                             (sumX2i(x2_array) * sumX1iYi(x1_array,y_array)     * sumX1iX2i(x1_array,x2_array))   
                             -            
                             (sumX2iYi(x2_array,y_array) * sumX1i_2(x1_array)           * sumX2i(x2_array))         -
                             (sumX1iX2i(x1_array,x2_array)* sumX1iX2i(x1_array,x2_array) * sumYi(y_array))          -
                             (sumX2i_2(x2_array)          * sumX1iYi(x1_array,y_array)   * sumX1i(x1_array));
    
    double determiantBeta1 = (n              * sumX1iYi(x1_array,y_array)             * sumX2i_2(x2_array))    +
                             (sumYi(y_array) * sumX1iX2i(x1_array,x2_array) * sumX2i(x2_array))                +
                             (sumX2i(x2_array) * sumX1i(x1_array)             * sumX2iYi(x2_array,y_array))
                             -
                             (sumX2i(x2_array)           * sumX1iYi(x1_array,y_array)   * sumX2i(x2_array))    -
                             (sumX2iYi(x2_array,y_array)  * sumX1iX2i(x1_array,x2_array) * n)                  -
                             (sumX2i_2(x2_array)          * sumX1i(x1_array)             * sumYi(y_array));
    
    double determiantBeta2 = (n               * sumX1i_2(x1_array)   * sumX2iYi(x2_array,y_array))             +
                             (sumX1i(x1_array) * sumX1iYi(x1_array,y_array)     * sumX2i(x2_array))            +
                             (sumYi(y_array)   * sumX1i(x1_array)     * sumX1iX2i(x1_array,x2_array))
                             -
                             (sumX2i(x2_array)             * sumX1i_2(x1_array)   * sumYi(y_array))            -
                             (sumX1iX2i(x1_array,x2_array) * sumX1iYi(x1_array,y_array)       * n)             -
                             (sumX2iYi(x2_array,y_array)   * sumX1i(x1_array)     * sumX1i(x1_array));
    
    
    double beta0 = determiantBeta0/determinantSystem;
    double beta1 = determiantBeta1/determinantSystem;
    double beta2 = determiantBeta2/determinantSystem;
    
    double predict(double beta0, double beta1, double beta2, double data1, double data2){
        return beta0 + (beta1*data1) + (beta2*data2);
    }
}
