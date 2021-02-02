
package Fuentes;

public class Link {
    public int iData; // data item (key)
    public double dData; // data item
    public Link next; // next link in list
    // -------------------------------------------------------------
    public Link(int id, double dd){
        iData = id; // initialize data
        dData = dd; // (‘next’ is automatically
        next = null;
    } // set to null)
    // -------------------------------------------------------------
    public Link(int id, double dd,Link start){
        iData = id; // initialize data
        dData = dd; // (‘next’ is automatically
        next = start;
    }
    // -------------------------------------------------------------
    public void displayLink(){
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}
