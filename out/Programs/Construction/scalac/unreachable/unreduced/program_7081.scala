package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_B, T_B], c: Char) extends T_A[C, T_B]
case class CC_B(a: Boolean, b: T_A[CC_A[T_B], T_A[Boolean, T_B]], c: Int) extends T_A[CC_A[Int], T_B]
case class CC_C() extends T_B
case class CC_D(a: T_A[CC_A[Int], T_B]) extends T_B
case class CC_E(a: CC_A[T_A[T_B, Int]], b: CC_A[Int]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _)) => 0 
  case CC_D(CC_B(_, _, _)) => 1 
}
}