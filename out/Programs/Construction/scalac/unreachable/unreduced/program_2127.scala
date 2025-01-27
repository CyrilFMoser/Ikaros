package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: T_A[C, C]) extends T_A[C, T_B]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_B]
case class CC_C[E](a: Boolean) extends T_A[E, T_B]

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_C(_) => 2 
}
}