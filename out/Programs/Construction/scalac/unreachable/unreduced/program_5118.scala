package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B[D](a: T_A[CC_A[Boolean], Boolean]) extends T_A[D, Boolean]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_B(_)) => 2 
  case CC_B(CC_A(_)) => 3 
  case CC_B(CC_B(CC_A(_))) => 4 
  case CC_B(CC_B(CC_B(_))) => 5 
}
}