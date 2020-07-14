public class intlist{
  public int first;
  public intlist rest;

  public intlist(int f, intlist r){
  first = f;
  rest = r;
  }

  // method to get ith item in the list
  public int get(int i) {
      if (i == 0) {
        return first;
      }
      return rest.get(i - 1);
  }
  public static void main(String[] args) {
    //select which intlist to get
    int x = Integer.parseInt(args[0]);

    intlist L = new intlist(15,null);
    L = new intlist(10,L);
    L = new intlist(5,L);
    System.out.println(L.get(x));
  }

  public int size(){
    if (rest == null) {
      return 1;
    }
    return 1 + this.rest.size();

  }

  public int iterativesize(){
    intlist p = this;
    int total = 0;
    while(p != null) {
      total += 1;
      p = p.rest;
    }
    return total;
  }
}
