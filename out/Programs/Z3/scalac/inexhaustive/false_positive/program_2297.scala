package Program_29 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B](a: T_B[B]) extends T_A
case class CC_C[C]() extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_B T_A Wildcard T_A)
// This is not matched: (CC_A T_A)