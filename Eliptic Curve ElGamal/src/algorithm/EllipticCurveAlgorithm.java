/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.ArrayList;

/**
 *
 * @author William Sentosa
 */
public class EllipticCurveAlgorithm {
   public static final long P = 23;
   public static final long A = 10;
   public static final long B = 15;
   private final Point base = new Point();
   
   private ArrayList<Point> field;
   
   /**
    * Elliptic Curve Algorithm with the function of y^2 = x^3 + Ax + B mod P
    */
   public EllipticCurveAlgorithm() {
       field = generateGaloisField();
   }
   
   /**
    * Generate Galois Field from the function. 
    */
   private ArrayList<Point> generateGaloisField() {
       ArrayList<Point> points = new ArrayList<>();
       return points;
   }
   
   /**
    * Function y^2 = x^3 + Ax + B mod P
    * @param x input variable
    * @return y value
    */
   private long function(long x) {
       long result = 0;
       
       return result;
   }
   
   private Point map(byte b) {
       Point result = new Point();
       return result;
   }
   
   private byte map(Point p) {
       byte result = 0;
       return result;
   }
   
   public byte[] encrypt(byte[] bytes, Point pub) {
       byte[] result = new byte[bytes.length];
       Point[] p = new Point[bytes.length];
       for(int i=0; i<bytes.length; i++) {
           p[i] = map(bytes[i]);
           p[i].encrypt(pub, base);
           result[i] = map(p[i]);
       }
       return result;
   }
   
   public byte[] decrypt(byte[] bytes, long pri) {
       byte[] result = new byte[bytes.length];
       Point[] p = new Point[bytes.length];
       for(int i=0; i<bytes.length; i++) {
           p[i] = map(bytes[i]);
           p[i].decrypt(pri, base);
           result[i] = map(p[i]);
       }
       return result;
   }
   
}
