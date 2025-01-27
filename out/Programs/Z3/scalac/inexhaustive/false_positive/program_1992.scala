package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (Int,Byte)) extends T_A[C, D]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)