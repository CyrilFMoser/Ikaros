package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (Boolean,Int)) extends T_A[D, C]

val v_a: CC_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_A Char Char (CC_C Char Boolean (T_A Char)) (T_A Char))