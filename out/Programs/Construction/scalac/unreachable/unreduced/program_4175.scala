package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[(Boolean,Char)]]) extends T_A
case class CC_B(a: Byte, b: T_A, c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_C) extends T_B[T_B[Byte]]
case class CC_E(a: CC_C, b: Boolean, c: Boolean) extends T_B[T_B[Byte]]
case class CC_F[B]() extends T_B[T_B[Byte]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_B(_, CC_C(), _) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B(_, CC_B(_, _, _), _)