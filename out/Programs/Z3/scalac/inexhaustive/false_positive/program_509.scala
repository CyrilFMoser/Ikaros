package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, Boolean]) extends T_A[D]
case class CC_B[E]() extends T_B[E, T_A[Int]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants