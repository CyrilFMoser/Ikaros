package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[Byte]
case class CC_B(a: T_A[Byte]) extends T_A[(T_A[Byte],CC_A)]
case class CC_C(a: (T_A[Byte],T_A[Byte])) extends T_A[(T_A[Byte],CC_A)]
case class CC_D(a: T_A[CC_B], b: Byte) extends T_B
case class CC_E(a: CC_B, b: T_B, c: T_A[Byte]) extends T_B
case class CC_F(a: CC_D, b: CC_E) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_B(CC_A(_, _)), CC_D(_, _), CC_A(_, _)) => 0 
  case CC_E(CC_B(CC_A(_, _)), CC_E(_, CC_D(_, _), CC_A(_, _)), CC_A(_, _)) => 1 
  case CC_E(CC_B(CC_A(_, _)), CC_E(_, CC_E(_, _, _), CC_A(_, _)), CC_A(_, _)) => 2 
  case CC_E(CC_B(CC_A(_, _)), CC_E(_, CC_F(_, _), CC_A(_, _)), CC_A(_, _)) => 3 
  case CC_E(CC_B(CC_A(_, _)), CC_F(_, CC_E(_, _, _)), CC_A(_, _)) => 4 
  case CC_F(_, CC_E(CC_B(_), CC_D(_, _), _)) => 5 
  case CC_F(_, CC_E(CC_B(_), CC_E(_, _, _), _)) => 6 
  case CC_F(_, CC_E(CC_B(_), CC_F(_, _), _)) => 7 
}
}
// This is not matched: CC_D(_, _)