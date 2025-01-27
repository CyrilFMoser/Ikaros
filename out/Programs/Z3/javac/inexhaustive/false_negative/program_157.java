package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A<B>() implements I_A<B>{}
record R_C<D>(I_A<D> a) implements I_A<D>{}
public static void main(String args[]) {

R_C<Character> v_a = null;
Integer v_b = switch (v_a){
  case R_C(R_C(var a)) -> 0; 
};
}

};
