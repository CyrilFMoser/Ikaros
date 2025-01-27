package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_A[T_B]) extends T_A[T_A[T_A[T_B]]]
case class CC_B() extends T_A[T_A[T_A[T_B]]]
case class CC_C() extends T_B
case class CC_D(a: (CC_A,CC_B)) extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((CC_A(_, _, _),CC_B())) => 0 
  case CC_E(CC_C()) => 1 
  case CC_E(CC_D(_)) => 2 
  case CC_E(CC_E(_)) => 3 
}
}
// This is not matched: CC_C()