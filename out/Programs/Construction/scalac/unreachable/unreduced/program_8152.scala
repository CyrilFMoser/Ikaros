package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_A, c: T_B[T_A]) extends T_A
case class CC_B(a: Int, b: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Boolean, b: CC_C, c: T_B[Byte]) extends T_B[Byte]
case class CC_E(a: T_A) extends T_B[Byte]
case class CC_F(a: T_A) extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _), _), _) => 1 
  case CC_A(_, CC_A(_, CC_C(), _), _) => 2 
  case CC_A(_, CC_B(_, CC_A(_, _, _)), _) => 3 
  case CC_A(_, CC_B(_, CC_B(_, _)), _) => 4 
  case CC_A(_, CC_B(_, CC_C()), _) => 5 
  case CC_A(_, CC_C(), _) => 6 
  case CC_B(_, CC_A(_, _, _)) => 7 
  case CC_B(_, CC_B(_, _)) => 8 
  case CC_B(_, CC_C()) => 9 
  case CC_C() => 10 
}
}