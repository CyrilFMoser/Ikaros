package Program_31 

package Program_5 

object Test {
sealed trait T_A
case class CC_A[A]() extends T_A
case class CC_B(a: Char, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B('x', CC_A()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A Boolean))