package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Byte), b: T_A[C, Char]) extends T_A[T_A[Boolean, Int], C]

val v_a: T_A[T_A[Boolean, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,0), _) => 0 
}
}
// This is not matched: (CC_C Wildcard (CC_C Byte Wildcard T_A) T_A)