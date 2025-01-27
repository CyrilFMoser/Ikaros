package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: Byte, b: Byte, c: T_B) extends T_A[T_B]
case class CC_C(a: T_A[Char], b: (CC_B,CC_B), c: T_B) extends T_A[T_B]
case class CC_D(a: T_B, b: CC_A) extends T_B
case class CC_E(a: CC_B) extends T_B
case class CC_F(a: T_A[(Int,CC_E)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_B(_, _, CC_D(_, _))) => 1 
  case CC_E(CC_B(_, _, CC_E(_))) => 2 
  case CC_E(CC_B(_, _, CC_F(_))) => 3 
}
}
// This is not matched: CC_F(_)