package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: Byte, b: T_A[Int], c: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[CC_A]) extends T_A[T_B]
case class CC_D() extends T_B
case class CC_E(a: CC_A, b: CC_C, c: T_A[T_B]) extends T_B
case class CC_F(a: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_C(_), CC_A()) => 1 
  case CC_E(_, CC_C(_), CC_B(_, _, _)) => 2 
  case CC_E(_, CC_C(_), CC_C(_)) => 3 
}
}
// This is not matched: CC_F(CC_D())