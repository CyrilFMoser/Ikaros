package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Byte) extends T_A
case class CC_B(a: CC_A, b: T_B[T_A, T_B[CC_A, T_A]]) extends T_A
case class CC_C[C](a: (T_B[(Boolean,Char), CC_B],T_B[CC_B, CC_B]), b: T_A) extends T_B[C, CC_B]
case class CC_D(a: T_A, b: T_A) extends T_B[CC_B, CC_B]
case class CC_E(a: CC_D) extends T_B[CC_B, CC_B]

val v_a: T_B[CC_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _) => 1 
  case CC_E(CC_D(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_E(CC_D(CC_A(_, _), CC_B(_, _))) => 3 
  case CC_E(CC_D(CC_B(_, _), CC_B(_, _))) => 4 
}
}
// This is not matched: CC_E(CC_D(CC_B(_, _), CC_A(_, _)))