/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Random;
import javafx.util.Pair;

/**
 * @author 
 * @author William Sentosa
 */
public class PointProccessor {
    
    public Point doublePoint(Point P){
        Point result = new Point();
        
        if (P.getY() == 0){
            result.setX(0);
            result.setY(0);
        } else {
            long lambda, inv, xr, yr;
            long p = EllipticCurveAlgorithm.P;
            long a = EllipticCurveAlgorithm.A;

            lambda = (((3*P.getX()*P.getX()) % p) + a) % p;
            inv = getInverse(2*P.getY(), p);
            lambda *= inv;
            lambda %= p;

            xr = (((lambda*lambda) % p) - (2*P.getX() % p) + p) % p;
            yr = (((lambda*(P.getX() - xr)) % p) - P.getY() + p) % p;
            
            if (yr < 0){
                yr += p;
            }
            
            result.setX(xr);
            result.setY(yr);
        }
        
        return result;
    }
    
    public Point multiply(long n, Point P) {
        Point result = new Point();
        Point base = new Point(P.getX(), P.getY());
        
        String binary = Long.toBinaryString(n);
        for (int i=binary.length()-1; i>=0; i--) {
            if (binary.charAt(i) == '1') {
                if (i == binary.length()-1){
                    result = base;
                } else {
                    result = add(result, base);
                }
            }
            base = doublePoint(base);
        }
        
        return result;
    }
    
    public long getInverse(long n, long m) {
        while (n > m) {
            n -= m;
        }

        while (n < 0) {
            n += m;
        }

        long gq = m, gy = 0;
        long lq = n, ly = 1;
        long tq = lq, ty = ly;
        while (lq != 1) {
            long d = gq/lq;
            lq = gq - d*lq; ly = gy - d*ly;
            gq = tq; gy = ty;
            tq = lq; ty = ly;
        }
        if (ly < 0) {
            ly += m;
        }
        return ly;
    }
    
    public Point add(Point p1, Point p2) {
        Point result = new Point();
        long p = EllipticCurveAlgorithm.P;
        
        if (p1.getX() == 0 && p1.getY() == 0){
            result.setX(p2.getX());
            result.setY(p2.getY());
        } else if (p2.getX() == 0 && p2.getY() == 0){
            result.setX(p1.getX());
            result.setY(p1.getY());
        } else if (p1.getY() == -p2.getY()){
            result.setX(0);
            result.setY(0);
        } else {
            long lambda, xr, yr, inv;
            
            lambda = (p1.getY() - p2.getY()) % p;
            inv = getInverse(p1.getX() - p2.getX(), p);
            lambda *= inv;
            lambda %= p;

            xr = (((lambda*lambda) % p) - p1.getX() - p2.getX() + 2*p) % p;
            yr = (((lambda*(p1.getX()-xr)) % p) - p1.getY() + 2*p) % p;

            result.setX(xr);
            result.setY(yr);
        }
        
        return result;
    }
    
    public Point minus(Point p1, Point p2){
        Point temp = new Point();
        Point res = new Point();
        
        temp.setX(p2.getX());
        temp.setY(-p2.getY());
        
        res = add(p1, temp);
        
        return res;
    }
    
    public Pair<Point, Point> encrypt(Point pm, Point pub, Point base) {
        Pair<Point, Point> Pc = null;
        long p = EllipticCurveAlgorithm.P;
//        Random randomNumber = new Random();
//      
//        long k = randomNumber.nextLong() % (p-1);
        long k = 5;
        
        Point px = new Point();
        Point py = new Point();
        
        px = multiply(k, base);
        py = add(pm, multiply(k,pub));
        
        Pc = new Pair(px, py);
        
        return Pc;
    }
    
    public Point decrypt(Pair<Point, Point> Pc, long pri, Point base) {
        Point temp = new Point();
        Point pm = new Point();
        
        temp = multiply(pri, Pc.getKey());
        
        pm = minus(Pc.getValue(),temp);
        
        return pm;
    }
    
    public static void main(String args[]) {
       EllipticCurveAlgorithm algorithm = new EllipticCurveAlgorithm();
       PointProccessor pp = new PointProccessor();
//     
       Point p1 = new Point(2,4);
       Point p2 = new Point(5,9);
//       Point base = new Point(0,1);
//       Point pub = new Point(3,3);
//       Point pm = new Point(110,124);
//       long pri = 3;
       
       System.out.println(p1);
       System.out.println(p2);
       
//       Pair<Point, Point> Pc = pp.encrypt(pm, pub, base);
//       System.out.println("pc " + Pc);
       
//       Point pm2 = new Point();
//       pm2 = pp.decrypt(Pc, pri, base);
//       System.out.println("pm2 " + pm2);
       
       Point multiplyPoint = new Point();
       multiplyPoint = pp.multiply(3, p1);
       System.out.println("multiply : " + multiplyPoint);
       
       Point addPoint = new Point();
       addPoint = pp.add(pp.doublePoint(p1), p1);
       System.out.println("Penjumlahan : " + addPoint);
       
//       Point tempPoint = new Point();
//       tempPoint = pp.multiply(pri, Pc.getKey());
//       System.out.println("b . kB : " + tempPoint);
       
//       Point minusPoint = new Point();
//       minusPoint = pp.minus(Pc.getValue(), tempPoint);
//       System.out.println("Pm : " + minusPoint);
       
//       Point doubleP = new Point();
//       doubleP = pp.doublePoint(p1);
//       System.out.println("Penggandaan 2P : " + doubleP);
//       
//       Point addPoint = new Point();
//       addPoint = pp.add(p1, doubleP);
//       System.out.println("Penjumlahan 2P+P : " + addPoint);
       
   }
}
