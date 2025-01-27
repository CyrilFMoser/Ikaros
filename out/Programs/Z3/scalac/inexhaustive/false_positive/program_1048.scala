package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: (Byte,Byte)) extends T_A[E, (Char,(Int,Char))]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_B (CC_A T_A)
//      (Tuple (CC_A T_A) (CC_B (CC_A T_A) (Tuple Wildcard Wildcard) T_A))
//      T_A)