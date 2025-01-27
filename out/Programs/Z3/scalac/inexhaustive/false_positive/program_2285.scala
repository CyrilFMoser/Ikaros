package Program_31 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B[B](a: CC_A, b: T_B[B], c: T_B[B]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Int, b: T_B[CC_C]) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
  case CC_B(_, _, CC_D(_, _)) => 2 
  case CC_B(_, CC_E(), _) => 3 
  case CC_B(CC_A(_), CC_E(), CC_D(_, _)) => 4 
  case CC_B(_, CC_E(), CC_D(_, _)) => 5 
  case CC_B(_, CC_D(_, _), CC_E()) => 6 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A Byte Byte (T_A Byte Byte))