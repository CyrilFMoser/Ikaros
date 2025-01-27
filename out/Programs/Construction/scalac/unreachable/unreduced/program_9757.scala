package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (T_A[Int, Boolean],T_A[Boolean, Int])) extends T_A[C, T_A[Boolean, T_A[Int, Byte]]]
case class CC_B[E](a: CC_A[CC_A[E, E], E], b: CC_A[E, E]) extends T_A[E, T_A[Boolean, T_A[Int, Byte]]]

val v_a: T_A[Byte, T_A[Boolean, T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _) => 1 
}
}