package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A<B>(I_A<Byte> a, I_A<Boolean> b, I_A<B> c) implements I_A<B>{}
record R_B<C>() implements I_A<C>{}
public static void main(String args[]) {

I_A<Integer> v_a = null;
Integer v_b = switch (v_a){
  case R_A(var a, var b, R_A(var c, var d, var e)) -> 0; 
  case R_A(R_A(var a, var b, var c), var d, var e) -> 1; 
  case R_A(R_B(), var a, R_B()) -> 2; 
  case R_B() -> 3; 
};
}

};
