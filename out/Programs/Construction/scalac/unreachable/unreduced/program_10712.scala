package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: CC_A) extends T_A[T_B]
case class CC_C(a: T_A[CC_A], b: CC_B, c: Byte) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(CC_A(_)), _) => 0 
  case CC_D() => 1 
}
}