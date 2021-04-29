public class DetermineQuadShape {

    public DetermineQuadShape(){
        System.out.println("No Lengths were Provided");
    }

    public DetermineQuadShape(int x){
        System.out.println("This is a Square");
    }

    public DetermineQuadShape(int x, int y){
        System.out.println("This is a Rect");
    }

    public DetermineQuadShape(int x, int y, int z){
        System.out.println("This is a Triangle");
    }

    public DetermineQuadShape(int x, int y, int p, int q){
        System.out.println("This is a Polygon");
    }

    public void printMe(){
        System.out.println("This is me");
    }

}
