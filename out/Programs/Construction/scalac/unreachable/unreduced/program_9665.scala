package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[CC_A], b: T_B[T_A]) extends T_A
case class CC_D(a: Boolean, b: T_B[T_A]) extends T_B[T_A]
case class CC_E(a: T_B[T_A], b: CC_D) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_C(_, _)) => 2 
  case CC_C(_, CC_D(_, CC_D(_, _))) => 3 
  case CC_C(_, CC_D(_, CC_E(_, _))) => 4 
  case CC_C(_, CC_E(_, _)) => 5 
}
}
// This is not matched: CC_B(CC_B(_))