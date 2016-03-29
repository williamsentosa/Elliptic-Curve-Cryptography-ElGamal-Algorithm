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
   public static final long P = 283;
   public static final long A = 12;
   public static final long B = 14;
   private final Point base = new Point();
   private final long NULL_VALUE = -1;
   
   private ArrayList<Point> field;
   private long[] poweredByTwo;
   
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
       ArrayList<Long> temp;
       generatePoweredByTwo();
       for(int i=0; i<P; i++) {
           temp = function(i);
           for(int j=0; j<temp.size(); j++) {
               Point p = new Point(i,temp.get(j));
               points.add(p);
           }
       }
       return points;
   }
   
   /**
    * Function y^2 = x^3 + Ax + B mod P
    * @param x input variable
    * @return y value
    */
   private ArrayList<Long> function(long x) {
       ArrayList<Long> result = new ArrayList<>();
       double y = NULL_VALUE;
       y = x*x*x + A*x + B;
       y = y % P;
       for(int i=0; i<poweredByTwo.length; i++) {
           if((poweredByTwo[i] % P) == y) {
               result.add((long) i);
           }
       }
       return result;
   }
   
   private void generatePoweredByTwo() {
       poweredByTwo = new long[(int)P];
       for(int i=0; i<P; i++) {
           poweredByTwo[i] = i * i;
       }
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
   
   public static void main(String args[]) {
       EllipticCurveAlgorithm algorithm = new EllipticCurveAlgorithm();
       int count = 0;
       for(int i=0; i<algorithm.field.size(); i++) {
           System.out.println(algorithm.field.get(i));
       }
       System.out.println(algorithm.field.size());
   }
   
}
