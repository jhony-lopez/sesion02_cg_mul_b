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
    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
class Polar{
   
    private int radio;
    private float angulo;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
}