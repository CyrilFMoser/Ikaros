package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: CC_B(_)