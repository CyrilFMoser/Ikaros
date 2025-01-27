package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B<C, D>{}
record R_A<E>(I_B<E, E> a, I_B<E, E> b) implements I_A<E, I_B<Integer, Boolean>>{}
record R_C<G, H>() implements I_B<G, H>{}
record R_D<I, J>() implements I_B<I, J>{}
record R_E() implements I_B<R_C<Character, Character>, R_D<Integer, Byte>>{}
public static void main(String args[]) {

R_A<R_E> v_a = null;
Integer v_b = switch (v_a){
  case R_A(var a, R_C()) -> 0; 
  case R_A(R_C(), var a) -> 1; 
  case R_A(R_D(), R_D()) -> 2; 
};
}

};
