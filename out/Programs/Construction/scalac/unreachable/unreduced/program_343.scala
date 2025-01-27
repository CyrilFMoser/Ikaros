package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_B, b: CC_A[T_A[T_B]]) extends T_B
case class CC_C(a: T_A[(CC_B,CC_B)], b: CC_A[T_A[T_B]]) extends T_B
case class CC_D(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D(CC_C(_, _)) => 1 
}
}
// This is not matched: CC_C(_, CC_A())