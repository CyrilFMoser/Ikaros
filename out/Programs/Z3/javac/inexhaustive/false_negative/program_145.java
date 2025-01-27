package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B<B, C>{}
record R_A<D>(I_A<D> a) implements I_A<D>{}
record R_B<E>() implements I_A<E>{}
record R_D<I, H>() implements I_B<I, H>{}
public static void main(String args[]) {

R_A<Byte> v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_A(var a)) -> 0; 
};
}

};
