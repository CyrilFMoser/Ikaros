package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Int, c: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: T_B, c: Byte) extends T_A[T_B]
case class CC_C(a: CC_B) extends T_A[T_B]
case class CC_D(a: CC_A, b: Int, c: T_A[(CC_B,CC_A)]) extends T_B
case class CC_E(a: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_A(_, _, _)) => 1 
  case CC_E(CC_B(_, CC_D(_, _, _), _)) => 2 
  case CC_E(CC_B(_, CC_E(_), _)) => 3 
}
}
// This is not matched: CC_E(CC_C(_))