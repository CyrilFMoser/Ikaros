package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[Byte, Char]) extends T_A
case class CC_C(a: CC_A, b: T_A) extends T_A
case class CC_D[C]() extends T_B[T_B[T_A, CC_C], C]
case class CC_E(a: CC_A) extends T_B[T_B[T_A, CC_C], T_B[T_B[T_A, CC_C], CC_B]]
case class CC_F(a: T_B[T_B[Boolean, CC_A], CC_B], b: T_B[T_B[T_A, CC_C], CC_B], c: T_B[CC_E, Int]) extends T_B[T_B[T_A, CC_C], T_B[T_B[T_A, CC_C], CC_B]]

val v_a: T_B[T_B[T_A, CC_C], T_B[T_B[T_A, CC_C], CC_B]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(CC_A(_))) => 1 
  case CC_E(CC_A(CC_B(_))) => 2 
  case CC_E(CC_A(CC_C(_, _))) => 3 
}
}
// This is not matched: CC_F(_, _, _)