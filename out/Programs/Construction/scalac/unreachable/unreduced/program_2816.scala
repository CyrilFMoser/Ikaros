package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Char) extends T_A[D, T_A[D, D]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}