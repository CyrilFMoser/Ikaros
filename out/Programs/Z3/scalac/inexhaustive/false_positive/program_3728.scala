package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: Char) extends T_A[T_A[Char, Boolean], T_A[T_A[Char, Boolean], T_A[Char, Boolean]]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Boolean (CC_A Boolean (T_A Boolean)) (T_A Boolean))