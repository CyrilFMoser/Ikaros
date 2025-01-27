package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, Char], b: Char) extends T_A[(Int,Char), T_A[Int, Boolean]]

val v_a: T_A[(Int,Char), T_A[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_B (T_A (T_A Int)))