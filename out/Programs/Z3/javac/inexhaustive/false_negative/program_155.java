package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
record R_A<D, C>(I_A<C, C> a, I_A<Byte, D> b, I_A<D, D> c) implements I_A<C, D>{}
record R_B<E, F>() implements I_A<E, F>{}
public static void main(String args[]) {

R_A<Integer, Integer> v_a = null;
Integer v_b = switch (v_a){
  case R_A(var a, R_A(var b, var c, var d), var e) -> 0; 
  case R_A(var a, R_B(), R_A(var b, var c, var d)) -> 1; 
  case R_A(var a, var b, R_B()) -> 2; 
};
}

};
