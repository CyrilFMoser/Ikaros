package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
record R_A<C, D>(I_A<C, D> a, I_A<D, C> b) implements I_A<C, D>{}
public static void main(String args[]) {

I_A<Byte, Integer> v_a = null;
Integer v_b = switch (v_a){
  case R_A<Byte, Integer>(R_A<Byte, Integer>(R_A<Byte, Integer>(var a, var b), var c), var d) -> 0; 
  case R_A<Byte, Integer>(R_A<Byte, Integer>(R_A<Byte, Integer>(var a, var b), R_A<Integer, Byte>(var c, var d)), R_A<Integer, Byte>(var e, R_A<Byte, Integer>(var f, var g))) -> 1; 
  case R_A<Byte, Integer>(R_A<Byte, Integer>(R_A<Byte, Integer>(var a, var b), R_A<Integer, Byte>(var c, var d)), R_A<Integer, Byte>(var e, var f)) -> 2; 
  case R_A<Byte, Integer>(var a, R_A<Integer, Byte>(var b, var c)) -> 3; 
  case R_A<Byte, Integer>(R_A<Byte, Integer>(var a, var b), R_A<Integer, Byte>(var c, var d)) -> 4; 
  case R_A<Byte, Integer>(R_A<Byte, Integer>(var a, R_A<Integer, Byte>(var b, var c)), R_A<Integer, Byte>(var d, var e)) -> 5; 
};
}

};
