package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[T_A[Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Boolean (CC_A Boolean (T_A Boolean)) (T_A Boolean))