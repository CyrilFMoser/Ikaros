package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Char,Char)) extends T_A[B]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: (CC_B Wildcard (CC_B Wildcard Wildcard Wildcard T_A) Wildcard T_A)