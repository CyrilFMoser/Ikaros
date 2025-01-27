package Program_15 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B[A](a: CC_A, b: T_B, c: CC_A) extends T_A
case class CC_C(a: CC_B[T_A], b: T_B) extends T_A
case class CC_D() extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
  case CC_B(_, CC_D(), _) => 2 
  case CC_B(_, _, CC_A()) => 3 
  case CC_B(_, _, _) => 4 
  case CC_B(CC_A(), _, _) => 5 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)