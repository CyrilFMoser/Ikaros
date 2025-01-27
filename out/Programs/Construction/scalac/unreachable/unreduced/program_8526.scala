package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: T_B[T_B[T_A]]) extends T_A
case class CC_B() extends T_B[CC_A]
case class CC_C(a: T_A) extends T_B[CC_A]
case class CC_D(a: T_A, b: T_B[CC_A]) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _)) => 1 
  case CC_D(_, CC_B()) => 2 
  case CC_D(_, CC_C(CC_A(_, _))) => 3 
  case CC_D(_, CC_D(_, CC_C(_))) => 4 
  case CC_D(_, CC_D(_, CC_D(_, _))) => 5 
}
}
// This is not matched: CC_D(_, CC_D(_, CC_B()))