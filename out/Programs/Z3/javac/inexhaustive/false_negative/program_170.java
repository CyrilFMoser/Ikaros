package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A<B>(I_A<B> a) implements I_A<B>{}
record R_B<C>() implements I_A<C>{}
public static void main(String args[]) {

R_A<Character> v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_B()) -> 0; 
};
}

};
