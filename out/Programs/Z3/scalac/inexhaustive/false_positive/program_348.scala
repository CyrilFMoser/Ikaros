package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (Char,Int)) extends T_A[D, Char]
case class CC_C() extends T_B[Char]

val v_a: CC_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_B Wildcard (Tuple (CC_C T_A) Wildcard) (CC_C T_A) T_A)