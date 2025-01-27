package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E, b: T_A[E, E], c: (CC_A[Boolean],(Byte,Char))) extends T_A[E, T_A[E, E]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_B(CC_C(_, _, _)) => 2 
}
}