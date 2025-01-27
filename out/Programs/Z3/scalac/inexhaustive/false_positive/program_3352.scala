package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Int, C]
case class CC_B[D, E](a: T_A[Int, E]) extends T_A[E, D]

val v_a: CC_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_C Char Byte Wildcard Wildcard (T_A Byte Char))