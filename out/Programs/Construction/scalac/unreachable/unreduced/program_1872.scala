package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Char, b: T_B) extends T_A[T_A[T_B, T_A[T_B, Boolean]], T_B]
case class CC_B(a: T_A[Byte, T_A[Byte, T_B]]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_C, b: (T_A[Int, CC_C],Int)) extends T_B

val v_a: T_A[T_A[T_B, T_A[T_B, Boolean]], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_)) => 0 
  case CC_A(_, CC_D(_, _)) => 1 
}
}
// This is not matched: CC_A(_, CC_C())