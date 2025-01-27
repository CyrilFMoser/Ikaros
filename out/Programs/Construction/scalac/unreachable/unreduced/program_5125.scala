package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int) extends T_A[Boolean]
case class CC_B(a: T_A[Boolean], b: Boolean, c: T_A[Char]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
  case CC_B(_, _, _) => 2 
}
}