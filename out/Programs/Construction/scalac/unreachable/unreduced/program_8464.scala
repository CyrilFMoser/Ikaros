package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: Char, b: CC_A, c: T_B) extends T_A[T_B]
case class CC_C(a: CC_B) extends T_A[T_B]
case class CC_D(a: CC_B) extends T_B
case class CC_E(a: CC_B, b: T_A[CC_C], c: CC_B) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), CC_D(_)) => 0 
  case CC_B(_, CC_A(_, _), CC_E(CC_B(_, _, _), _, CC_B(_, _, _))) => 1 
}
}