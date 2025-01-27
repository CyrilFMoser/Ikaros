package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: (Byte,Boolean)) extends T_A[T_A[D, D], D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_A (CC_B (CC_A Wildcard Wildcard Wildcard T_A) T_A) Wildcard Wildcard T_A)