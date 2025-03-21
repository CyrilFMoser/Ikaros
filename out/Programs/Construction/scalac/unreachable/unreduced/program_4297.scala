package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: Byte) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B[D, E](a: T_A[D, D]) extends T_A[D, T_A[D, T_A[D, D]]]

val v_a: T_A[Boolean, T_A[Boolean, T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}