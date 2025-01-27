package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard (T_A Char))