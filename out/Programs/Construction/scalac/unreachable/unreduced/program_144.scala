package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[T_B, C]) extends T_A[C, T_B]
case class CC_B() extends T_A[T_A[T_A[T_B, T_B], T_B], T_A[T_B, T_B]]
case class CC_C() extends T_B
case class CC_D(a: T_B) extends T_B
case class CC_E(a: T_A[Byte, CC_A[Byte]], b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C()) => 1 
  case CC_D(CC_D(_)) => 2 
  case CC_D(CC_E(_, _)) => 3 
  case CC_E(_, CC_D(_)) => 4 
  case CC_E(_, CC_E(_, _)) => 5 
}
}
// This is not matched: CC_E(_, CC_C())