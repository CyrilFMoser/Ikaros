package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_B[Byte, T_A], b: T_B[T_B[Byte, T_A], T_B[CC_A, CC_A]]) extends T_B[Byte, T_A]
case class CC_C(a: (Int,T_B[Int, Int]), b: T_B[Byte, T_A]) extends T_B[Byte, T_A]
case class CC_D() extends T_B[Byte, T_A]

val v_a: T_B[Byte, T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_B(CC_B(_, _), _)) => 1 
  case CC_C(_, CC_B(CC_C(_, _), _)) => 2 
  case CC_C(_, CC_C(_, _)) => 3 
  case CC_C(_, CC_D()) => 4 
  case CC_D() => 5 
}
}
// This is not matched: CC_C(_, CC_B(CC_D(), _))