package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_B[T_A]), b: T_B[T_B[T_A]], c: T_A) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: T_B[T_B[CC_A]]) extends T_B[CC_A]
case class CC_D(a: Char, b: T_B[CC_A]) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, CC_C(_))) => 0 
  case CC_D(_, CC_D(_, CC_D(_, _))) => 1 
  case CC_D(_, CC_D(_, CC_E())) => 2 
  case CC_D(_, CC_E()) => 3 
}
}
// This is not matched: CC_D(_, CC_C(_))