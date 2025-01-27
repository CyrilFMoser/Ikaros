package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: (T_A,Int), b: T_B[CC_A, CC_A]) extends T_A
case class CC_C[C]() extends T_B[CC_B, C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),_), _) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_A Wildcard T_A) (CC_B Wildcard T_A)) T_A)