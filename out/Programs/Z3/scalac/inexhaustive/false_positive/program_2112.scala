package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Int,Char)) extends T_A[T_A[Char, Boolean], (Byte,Char)]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: (CC_A (CC_C Wildcard T_A) T_A)