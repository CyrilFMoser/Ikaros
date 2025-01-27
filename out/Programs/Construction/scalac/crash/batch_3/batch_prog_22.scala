package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Int, b: T_A[D, C], c: T_A[D, D]) extends T_A[C, D]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, (T_A[Char, Boolean],T_A[Boolean, Boolean])]

val v_a: T_A[Byte, (T_A[Char, Boolean],T_A[Boolean, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: CC_B(_)