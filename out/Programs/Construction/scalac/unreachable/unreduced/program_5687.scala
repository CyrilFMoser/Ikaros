package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B[D](a: D, b: D) extends T_A[D, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_B(_, _) => 2 
}
}