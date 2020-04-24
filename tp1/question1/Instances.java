package question1;
public class Instances
{
   public static void main (String []  args)
   {
       Circle circle = new Circle();
       Square square =  new Square();
       Triangle triangle =  new Triangle();
       
       circle.makeVisible();
       triangle.makeVisible();
       square.makeVisible();
       
       square.moveRight();
       circle.moveDown();
       
       triangle.changeColor("black");
    }
} 