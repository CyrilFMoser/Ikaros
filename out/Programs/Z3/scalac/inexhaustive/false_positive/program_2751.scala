package Program_31 

package Program_11 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B[A](a: A, b: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_C Int Int (T_A Int Int))