package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B<B>{}
record R_A<C>() implements I_A<C>{}
record R_B<D>(I_A<D> a) implements I_A<D>{}
record R_C<E>() implements I_B<E>{}
public static void main(String args[]) {

I_A<Character> v_a = null;
Integer v_b = switch (v_a){
  case R_A() -> 0; 
  case R_B(R_B(var a)) -> 1; 
};
}

};
