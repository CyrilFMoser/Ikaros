package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: Byte) extends T_A[T_B]
case class CC_B(a: T_A[(CC_A,CC_A)], b: T_B) extends T_A[T_B]
case class CC_C(a: T_B, b: T_A[T_B]) extends T_A[T_B]
case class CC_D(a: CC_C, b: T_B, c: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_D(_, _, CC_A(_, _)), _) => 1 
  case CC_C(CC_D(_, _, CC_B(_, _)), _) => 2 
  case CC_C(CC_D(_, _, CC_C(_, _)), _) => 3 
}
}
// This is not matched: CC_A(_, _)