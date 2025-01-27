package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A<B>() implements I_A<B>{}
record R_B<C>(I_A<C> a) implements I_A<C>{}
public static void main(String args[]) {

R_B<Integer> v_a = null;
Integer v_b = switch (v_a){
  case R_B(R_A()) -> 0; 
};
}

};
