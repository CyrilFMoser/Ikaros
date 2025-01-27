package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[T_B[Char]], b: (T_A,CC_A)) extends T_A
case class CC_D(a: T_A, b: CC_C, c: CC_A) extends T_B[T_A]
case class CC_E() extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, CC_C(_, _), CC_A(_))) => 0 
  case CC_A(CC_E()) => 1 
  case CC_B(CC_A(_)) => 2 
  case CC_B(CC_B(_)) => 3 
  case CC_B(CC_C(_, _)) => 4 
  case CC_C(_, (CC_B(_),CC_A(_))) => 5 
  case CC_C(_, (CC_C(_, _),CC_A(_))) => 6 
}
}
// This is not matched: CC_C(_, (CC_A(_),CC_A(_)))