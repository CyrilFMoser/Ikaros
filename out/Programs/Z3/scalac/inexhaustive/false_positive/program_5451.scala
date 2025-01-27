package Program_15 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B](a: Char, b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_A) extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B('x', _) => 2 
  case CC_B(_, _) => 3 
  case CC_B('x', CC_A()) => 4 
  case CC_C() => 5 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B Int (T_A Int))