package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B[D](a: T_A[D, Boolean], b: T_A[D, D], c: T_A[D, Boolean]) extends T_A[D, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(CC_A(_), _, _)) => 2 
  case CC_A(CC_B(CC_B(_, _, _), _, _)) => 3 
  case CC_B(_, _, _) => 4 
}
}