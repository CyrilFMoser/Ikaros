package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Char), b: T_A[C, Boolean]) extends T_A[T_A[Byte, Boolean], C]

val v_a: T_A[T_A[Byte, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,'x'), _) => 0 
}
}
// This is not matched: (CC_A (CC_B Wildcard T_A) (CC_B Boolean T_A) T_A)