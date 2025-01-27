package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B[D](a: D, b: CC_A[D], c: T_A[D, D]) extends T_A[D, Boolean]
case class CC_C(a: T_A[T_A[Int, Char], CC_B[Char]], b: Int) extends T_A[T_A[CC_B[Int], Boolean], Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}