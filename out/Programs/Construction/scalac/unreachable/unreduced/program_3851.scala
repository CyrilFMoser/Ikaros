package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A]) extends T_B[CC_A]
case class CC_C(a: Int, b: CC_B) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(CC_A(_), _)) => 0 
  case CC_B(_, CC_C(_, CC_B(_, _))) => 1 
  case CC_C(_, CC_B(CC_A(_), CC_C(_, _))) => 2 
}
}
// This is not matched: CC_C(_, CC_B(CC_A(_), CC_B(_, _)))