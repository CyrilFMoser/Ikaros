package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: Byte) extends T_A
case class CC_B(a: T_B[(CC_A,Char)]) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D(a: Byte, b: CC_C, c: Boolean) extends T_B[T_A]
case class CC_E() extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), _) => 2 
  case CC_C(CC_C(CC_A(_, _, _), _), _) => 3 
  case CC_C(CC_C(CC_B(_), _), _) => 4 
  case CC_C(CC_C(CC_C(_, _), _), _) => 5 
}
}
// This is not matched: CC_C(CC_A(_, _, _), _)