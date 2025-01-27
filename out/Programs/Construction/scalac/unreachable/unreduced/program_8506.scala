package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B() extends T_B[CC_A[CC_A[Boolean]], T_A[Byte, T_A[Byte, Byte]]]
case class CC_C(a: (CC_B,CC_A[Int]), b: Byte, c: CC_A[CC_A[CC_B]]) extends T_B[CC_A[CC_A[Boolean]], T_A[Byte, T_A[Byte, Byte]]]

val v_a: T_B[CC_A[CC_A[Boolean]], T_A[Byte, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_B(),CC_A(_, _)), _, CC_A(_, _)) => 1 
}
}