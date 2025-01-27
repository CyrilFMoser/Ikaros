package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[T_A[Byte, C], C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A (CC_B Wildcard (CC_A Wildcard Wildcard Wildcard T_A) T_A)
//      Wildcard
//      Wildcard
//      T_A)