package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, (Char,Char)]]
case class CC_B() extends T_A[CC_A[CC_A[Char]], T_A[CC_A[CC_A[Char]], (Char,Char)]]
case class CC_C(a: CC_B) extends T_A[CC_A[CC_A[Char]], T_A[CC_A[CC_A[Char]], (Char,Char)]]

val v_a: T_A[CC_A[CC_A[Char]], T_A[CC_A[CC_A[Char]], (Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(CC_B()) => 1 
}
}
// This is not matched: CC_B()