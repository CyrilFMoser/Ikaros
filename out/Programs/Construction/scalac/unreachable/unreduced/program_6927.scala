package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), (T_A,T_A)], b: T_A, c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C[C, D](a: ((Boolean,CC_A),(CC_B,T_A)), b: (T_B[CC_B, T_A],T_A)) extends T_B[C, T_A]

val v_a: T_B[T_A, T_A] = null
val v_b: Int = v_a match{
  case CC_C(((_,_),(_,_)), (CC_C(_, _),CC_A(_, _, _))) => 0 
  case CC_C(((_,_),(_,_)), (CC_C(_, _),CC_B())) => 1 
}
}