
package Fuentes;

public class LinkList {
    private Link first; // ref. to first link on list
	// -------------------------------------------------------------
	public LinkList() // constructor
	{
            first = null; // no items on list yet
	}
	// -------------------------------------------------------------
	public boolean isEmpty() // true if list is empty
	{
            return (first==null);
	}
	// -------------------------------------------------------------
	// insert at start of list
	public void insertFirst(int id, double dd)
	{ // make new link
            if(isEmpty()){
                first=new Link(id, dd);
            } else{
                first=new Link(id, dd, first);
            }
            /*Link newLink = new Link(id, dd);
            newLink.next = first; // newLink --> old first
            first = newLink; // first --> newLink*/
	}
	// -------------------------------------------------------------
	public Link deleteFirst() // delete first item
	{ // (assumes list not empty)
            Link temp = first; // save reference to link
            first = first.next; // delete it: first-->old next
            return temp; // return deleted link
	}
	// -------------------------------------------------------------
        public void insertLast(int id, double dd){
            if(isEmpty()){
                first=new Link(id, dd);
            } else{
                Link p,q;
                q=p=first;
                while (p!=null) {                
                    q=p;
                    p=p.next;
                }
                q.next=new Link(id, dd);
            }
        }
        // -------------------------------------------------------------
        public Link deleteLast(){
            Link p,q,r;
            q=p=r=first;
            r=r.next;
            if(count()==1){
                first=first.next;
            }else{
                while (r!=null) {                
                    q=p;
                    p=p.next;
                    r=r.next;
                }
                q.next=null;
            }
            return q;
        }
        // -------------------------------------------------------------
        public int count(){
            int i=0;
            Link p=first;
            while (p!=null) {                
                p=p.next;
                i++;
            }
            return i;
        }
        // -------------------------------------------------------------
	public void displayList()
	{
            System.out.print("List (first-->last): ");
            Link current = first; // start at beginning of list
            while(current != null) // until end of list,
            {
                current.displayLink(); // print data
                current = current.next; // move to next link
            }
            System.out.println("");
	}
}
