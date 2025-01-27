package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, Char]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)