package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[(Boolean,Boolean), CC_A], b: Byte) extends T_A
case class CC_C(a: CC_A, b: (T_B[CC_B, CC_A],CC_A)) extends T_A
case class CC_D[C](a: CC_C, b: CC_B) extends T_B[Boolean, C]
case class CC_E(a: T_B[CC_B, T_B[T_A, CC_C]]) extends T_B[T_B[Boolean, CC_C], CC_A]
case class CC_F[D]() extends T_B[Boolean, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _)) => 1 
  case CC_B(_, 0) => 2 
  case CC_B(_, _) => 3 
  case CC_C(_, (_,CC_A(_))) => 4 
}
}
// This is not matched: CC_A(CC_C(_, _))