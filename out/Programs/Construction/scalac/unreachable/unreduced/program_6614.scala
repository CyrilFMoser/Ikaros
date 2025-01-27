package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[Byte]], c: T_A[T_B]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: CC_B, b: T_A[T_B], c: T_B) extends T_A[T_B]
case class CC_D(a: CC_A) extends T_B
case class CC_E[B](a: Int) extends T_B
case class CC_F(a: CC_E[CC_A], b: T_B, c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _)) => 0 
  case CC_E(_) => 1 
  case CC_F(_, _, _) => 2 
}
}