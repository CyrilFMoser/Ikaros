package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: T_A) extends T_A
case class CC_B(a: Boolean, b: CC_A) extends T_A
case class CC_C(a: T_A, b: Byte, c: T_B[T_A]) extends T_A
case class CC_D() extends T_B[Boolean]
case class CC_E() extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, CC_A(_, _))) => 1 
  case CC_A(_, CC_C(CC_A(_, _), _, _)) => 2 
  case CC_A(_, CC_C(CC_B(_, _), _, _)) => 3 
  case CC_A(_, CC_C(CC_C(_, _, _), _, _)) => 4 
  case CC_B(_, CC_A(_, _)) => 5 
  case CC_C(_, _, _) => 6 
}
}