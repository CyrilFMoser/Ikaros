package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char) extends T_A[C, Boolean]
case class CC_B[D](a: T_A[D, Boolean]) extends T_A[D, Boolean]
case class CC_C[E](a: T_A[E, E]) extends T_A[E, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(CC_A(_))) => 2 
  case CC_B(CC_B(CC_C(_))) => 3 
  case CC_B(CC_C(_)) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_B(CC_B(CC_B(_)))