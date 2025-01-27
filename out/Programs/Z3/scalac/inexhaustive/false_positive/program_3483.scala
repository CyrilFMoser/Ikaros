package Program_15 

object Test {
sealed trait T_A[A]
case class CC_B(a: Char) extends T_A[T_A[Int]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_C (T_A Int Int)
//      (T_B Boolean)
//      Boolean
//      Wildcard
//      (T_A (T_B Boolean) (T_A Int Int)))