package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B<A>{}
record R_A(I_B<I_A> a, I_B<I_A> b, I_A c) implements I_A{}
record R_B() implements I_A{}
record R_D<B>() implements I_B<B>{}
record R_E<C>() implements I_B<C>{}
record R_F<D>() implements I_B<D>{}
public static void main(String args[]) {

R_A v_a = null;
Integer v_b = switch (v_a){
  case R_A(var a, R_F(), var b) -> 0; 
  case R_A(R_F(), var a, var b) -> 1; 
  case R_A(R_E(), R_E(), var a) -> 2; 
  case R_A(R_D(), var a, var b) -> 3; 
  case R_A(var a, R_D(), var b) -> 4; 
};
}

};
