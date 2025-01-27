package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[T_A[Boolean, T_A[Byte, Char]], C]
case class CC_B[D](a: D) extends T_A[T_A[Boolean, T_A[Byte, Char]], D]
case class CC_C[E](a: T_A[E, E], b: Boolean) extends T_A[E, CC_A[CC_A[Boolean]]]

val v_a: T_A[T_A[Boolean, T_A[Byte, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(12) => 1 
}
}
// This is not matched: CC_B(_)