/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.ArrayList;
import java.util.Random;
import javafx.util.Pair;

/**
 *
 * @author William Sentosa
 */
public class EllipticCurveAlgorithm {
   public static final long P = 307;
   public static final long A = 11;
   public static final long B = 14;
   public final Point base;
   private final long NULL_VALUE = -1;
   
   private ArrayList<Point> field;
   private long[] poweredByTwo;
   
   /**
    * Elliptic Curve Algorithm with the function of y^2 = x^3 + Ax + B mod P
    */
   public EllipticCurveAlgorithm() {
       field = generateGaloisField();
       base = field.get(10); // Creating base point
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
   
   /**
    * Generate an array with elements which powered by two.
    */
   private void generatePoweredByTwo() {
       poweredByTwo = new long[(int)P];
       for(int i=0; i<P; i++) {
           poweredByTwo[i] = i * i;
       }
   }
   
   /**
    * Mapping from byte to point
    * @param b byte which will be mapped
    * @return Point
    */
   private Point map(byte b) {
       int index = (int) b & 0xFF;
       Point result = new Point(field.get(index).getX(), field.get(index).getY());      
       return result;
   }
   
   /**
    * Mapping from point too byte
    * @param p point which will be mapped
    * @return byte 
    */
   private byte map(Point p) {
       byte result = 0;
       for(int i=0; i<field.size(); i++) {
           if(field.get(i).isEqual(p)) {
               result = (byte) i;
               break;
           }
       }
       return result;
   }
   
   /**
    * Generating a random public key with maximum value of P
    * @return a random public key
    */
   public long generatePublicKey() {
       Random rand = new Random();
       return rand.nextLong() % P;
   }
   
   /**
    * Generate a private key based on a public key
    * @param pub public key
    * @return private key
    */
   public Point generatePrivateKey(long pub) {
       PointProccessor processor = new PointProccessor();
       Point result = processor.multiply(pub, base);
       return result;
   }
   
   /**
    * Encrypt array of byte to encrypted byte
    * @param bytes array of byte which will be encrypted
    * @param pub public key in Point
    * @return encrypted byte
    */
   public byte[] encrypt(byte[] bytes, Point pub) {
       PointProccessor processor = new PointProccessor();
       byte[] result = new byte[bytes.length*2];
       Point[] p = new Point[bytes.length];
       int j = 0;
       System.out.println("*** Enkripsi ***");
       for(int i=0; i<bytes.length; i++) {
           p[i] = map(bytes[i]);
           System.out.println(p[i]);
           Pair<Point, Point> pair = processor.encrypt(p[i], pub, base);
           System.out.println(pair); 
           result[j] = map(pair.getKey());
           j++;
           result[j] = map(pair.getValue());
           j++;
       }
       return result;
   }
   
   /**
    * Decrypt decrypted array of byte to array of byte 
    * @param bytes array of byte which will be decrypted
    * @param pri private key
    * @return array of byte
    */
   public byte[] decrypt(byte[] bytes, long pri) {
       PointProccessor processor = new PointProccessor();
       byte[] result = new byte[bytes.length/2];
       int j = 0;
       System.out.println("*** Dekripsi ***");
       for(int i=0; i<result.length; i++) {
           Pair<Point, Point> pair = new Pair(map(bytes[j]),map(bytes[j+1]));
           System.out.println(pair);
           j+=2;
           Point temp = processor.decrypt(pair, pri, base);
           System.out.println(temp);
           result[i] = map(temp);
       }
       return result;
   }
   
   public static void main(String args[]) {
       EllipticCurveAlgorithm algorithm = new EllipticCurveAlgorithm();
       for(int i=0; i<algorithm.field.size(); i++) {
           System.out.println(algorithm.field.get(i));
       }
//       PointProccessor processor = new PointProccessor();
//       String text = "Halo nama saya adalah william sentosa";
//       byte[] bytes = text.getBytes();
//       System.out.println("Base Point : " + algorithm.base);
//       for(int i=0; i<bytes.length; i++) {
//           System.out.print(bytes[i] + " ");
//       }
//       System.out.println();
//       long pri = 5;
//       Point pub = processor.multiply(pri, algorithm.base);
//       byte[] result = algorithm.encrypt(bytes, pub);
////       String str = new String(result);
////       System.out.println(str);
//       result = algorithm.decrypt(result, pri);
//       for(int i=0; i<result.length; i++) {
//           System.out.print(result[i] + " ");
//       }
////       str = new String(result);
////       System.out.println(str);
   }
   
}
