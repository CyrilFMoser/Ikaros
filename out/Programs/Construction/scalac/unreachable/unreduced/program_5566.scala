package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: T_A, c: Boolean) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_B, b: T_B[T_A]) extends T_A
case class CC_D(a: T_A, b: T_B[Byte]) extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, CC_A(_, _, _), true)) => 1 
  case CC_B(CC_A(_, CC_B(_), true)) => 2 
  case CC_B(CC_A(_, CC_C(_, _), true)) => 3 
  case CC_B(CC_A(_, CC_A(_, _, _), false)) => 4 
  case CC_B(CC_A(_, CC_B(_), false)) => 5 
  case CC_B(CC_A(_, CC_C(_, _), false)) => 6 
  case CC_C(CC_B(CC_A(_, _, _)), _) => 7 
}
}