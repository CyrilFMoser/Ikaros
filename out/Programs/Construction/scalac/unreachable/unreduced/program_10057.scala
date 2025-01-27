package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_A[(Int,Boolean), T_B], T_B], C]
case class CC_B[D](a: T_B, b: Boolean) extends T_B
case class CC_C[E](a: E, b: CC_B[E]) extends T_B
case class CC_D(a: T_A[(T_B,Char), T_A[Int, T_B]], b: CC_B[CC_B[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, CC_B(_, _)) => 2 
}
}