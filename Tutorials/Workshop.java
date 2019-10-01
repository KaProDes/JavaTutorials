import java.io.*;
import java.util.*;

//Driver class

class Workshop
{
  public static void main(String[] args)throws IOException {
    String s="101 Compressor 500 25 102 Jack 250 25 103 Oil 150 25 104 Battery 1500 25 105 Headlight 750 40 106 Airfilter 1000 25 107 Seatcover 600 50 108 Mat 250 30 109 Backlight 1500 50 110 Tyre 1250 35";
    Item ob1[]=new Item[10];
    Item ob2=new Item();


    StringTokenizer ob=new StringTokenizer(s);

      for (int j = 0; j<=9; j++)
      {
        ob1[j]=new Item();
        ob1[j].initialize(Integer.parseInt(ob.nextToken()),ob.nextToken(),Integer.parseInt(ob.nextToken()),Integer.parseInt(ob.nextToken()));
      }
      System.out.println ("Present list");
      for (int j=0;j<=9;j++)
      {
      ob2.display(ob1[j]);
    }


    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


    Sales obs=new Sales();
    Purchase obp=new Purchase();
    Bill oba=new Bill();

    while (true)
    {
    System.out.println ("Enter 1 for sales, 2 for Purchase, 3 for bill generation, 4 for exit");
    int choice=Integer.parseInt(br.readLine());
    int ct=0;
    int ct1=0;


      if (choice==1){
        System.out.println ("Enter the name of customer");
        String namec=br.readLine();
        while (ct==0)
        {
        System.out.println("Enter the id and quantity");
        int idt=Integer.parseInt(br.readLine());
        int qtyt=Integer.parseInt(br.readLine());
        obs.sell(idt,qtyt,ob1);
        oba.genbill(idt,qtyt,ob1);
        System.out.println("Enter 1 for more items, 2 for exit");
        ct1=Integer.parseInt(br.readLine());
        if (ct1==2)
        {ct=1;
          oba.disbill();
        }
      }}
      else if (choice==2)
      {
        System.out.println("Enter the id and quantity");
        int idt=Integer.parseInt(br.readLine());
        int qtyt=Integer.parseInt(br.readLine());
        obp.purch(idt,qtyt,ob1);
      }
      else if (choice==4)
      {
        break;
      }
      else
      {
        System.out.println ("Hello");
      }
      System.out.println ("Updated list");
      for (int j=0;j<=9;j++)
      {
      ob2.display(ob1[j]);
    }}}
}

//Item class

class Item
{
  int id;
  String name;
  int price;
  int qty;

  void initialize(int id1, String n1, int p1, int q1)
  {
    id=id1;
    name=n1;
    price=p1;
    qty=q1;
  }


  void display(Item obt)
  {
    
      System.out.println ((obt.id) +" " +(obt.name) +" " +(obt.price) +" " +(obt.qty));


  }


}

//Purchase class

class Purchase extends Item
{


  void purch(int idp, int qtyp, Item obs[])
  {
    for (int i=0;i<=9;i++)
    {
      if (obs[i].id==idp)
      {
        obs[i].qty=obs[i].qty+qtyp;
      }
    }

  }
}

//Sales class

class Sales extends Item
{


  void sell(int ids, int qtys, Item obs[])
  {
    for (int i=0;i<=9;i++)
    {
      if (obs[i].id==ids)
      {
        obs[i].qty=obs[i].qty-qtys;
      }
    }

  }
}

//Bill Class

class Bill extends Item
{
  String b=""; String bt="";

  void genbill(int idd, int q, Item obb[])
  {
    for (int i=0;i<=9;i++)
    {
      if (obb[i].id==idd)
      {
        bt=obb[i].name;
      }
    }
    b=b+bt+" "+Integer.toString(idd)+" "+Integer.toString(q)+" ";
    System.out.println (b);
  }


void disbill()
{
  System.out.println (b);
}
}
