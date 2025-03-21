class Wheelstart{
public static void main(String[] args){
//float dia,float width,String mat,String comp,int off,int load, int center ,boolean bed,String shape,String finish)
 float d=20;
 float w=15;
 String m="alloy";
 String comp="CEAT";
 int of=13;
 int load=150;
 int c=12;
 boolean b=true;
 String s="Star";
 String f="paint";
 Wheel.w_details(d,w,m,comp,of,load,c,b,s,f);
 
 d=20;
 w=15;
  m="metal";
  comp="MRF";
  of=15;
  load=170;
  c=11;
  b=true;
  s="Star";
 f="paint";
 Wheel.w_details(d,w,m,comp,of,load,c,b,s,f);
 
 System.out.println("");
 d=15;
 w=12;
  m="fiber";
  comp="CEAT";
  of=15;
  load=80;
  c=10;
  b=true;
  s="spoke";
 f="wash";
 Wheel.w_details(d,w,m,comp,of,load,c,b,s,f);
 
 System.out.println("");
 d=18;
 w=20;
  m="metal";
  comp="casip";
  of=12;
  load=140;
  c=11;
  b=true;
  s="Star";
 f="paint";
 Wheel.w_details(d,w,m,comp,of,load,c,b,s,f);
 
 System.out.println("");
 System.out.println("");
 d=19;
 w=19;
  m="alloy";
  comp="jp";
  of=17;
  load=140;
  c=13;
  b=true;
  s="wide";
 f="polish";
 Wheel.w_details(d,w,m,comp,of,load,c,b,s,f);
}
}