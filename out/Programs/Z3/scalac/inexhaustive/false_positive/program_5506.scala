package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_D(a: Char) extends T_B[T_A[(Int,Boolean), (Int,Int)]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)