package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_B[B](a: T_A, b: Char, c: T_B[B]) extends T_B[B]
case class CC_C[C]() extends T_B[C]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)