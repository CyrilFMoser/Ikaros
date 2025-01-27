package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[Boolean]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: T_A) extends T_A
case class CC_C(a: T_B[T_A]) extends T_A
case class CC_D(a: CC_B) extends T_B[T_A]
case class CC_E(a: Boolean) extends T_B[T_A]
case class CC_F() extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, CC_A(_, _), CC_A(_, _))) => 0 
  case CC_D(CC_B(_, CC_A(_, _), CC_B(_, _, _))) => 1 
  case CC_D(CC_B(_, CC_A(_, _), CC_C(_))) => 2 
  case CC_E(true) => 3 
  case CC_E(false) => 4 
}
}
// This is not matched: CC_F()