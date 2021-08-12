package sistemacoordenadas2d;

/*bajo es sistema de coordenadas cartesianas referir un punto en un plano 2d
con sus respectivas coordenadas y valores.
Dichos valores deben asignarse como una entrada pr teclado de parte del usuario
*/

public class SistemaCoordenadas2D {
    
    public static void main(String[] args) {
        cartesianas2D punto = new cartesianas2D();
        Polar punto2 = new Polar();
        //agregar las instrucciones necesarias para que se presente
        //en pantalla la solicitud de los datos y posterirmente 
        //el usuario los ingrese desde el teclado
        punto.setX(4); 
    }  
}
class cartesianas2D{
    
    private double x,y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    
    
    public cartesianas2D polar_cartesiana2D(double r, double angulo){
        cartesianas2D obj = new cartesianas2D();
        x = r*Math.cos(angulo);
        y = r*Math.cos(angulo);
        
        return obj;
    }
    
    public cartesianas2D polar_cartesiana2D(Polar p){
        return polar_cartesiana2D(p.getRadio(),p.getAngulo());
    }
    
}
class Polar{
   
    private double radio;
    private double angulo;
    
    public Polar(){
    }

    public Polar(double radio, double angulo) {
        this.radio = radio;
        this.angulo = angulo;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
    
    public Polar cartesiana2D_polar(double x, double y){
        double r = Math.sqrt(x*x+y*y);
        double ang = Math.atan(y/x);
        return new Polar(r, ang); 
    }
    
    public Polar cartesiana2D_polar(cartesianas2D c){
        return new Polar(c.getX(), c.getY());
    }

  
}