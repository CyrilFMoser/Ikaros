package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Byte]], b: T_A[(Boolean,T_B)]) extends T_A[T_A[Byte]]
case class CC_B(a: Byte, b: T_B, c: Byte) extends T_A[T_A[Byte]]
case class CC_C(a: (Char,Boolean), b: CC_B) extends T_B
case class CC_D(a: T_A[T_A[T_B]]) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C(_, _), 0) => 0 
  case CC_B(_, CC_D(_), 0) => 1 
  case CC_B(_, CC_C(_, _), _) => 2 
}
}
// This is not matched: CC_B(_, CC_D(_), _)