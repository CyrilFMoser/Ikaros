package Program_31 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B](a: ((Byte,Int),CC_A), b: T_B[B]) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C() => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_D Int Wildcard Wildcard (CC_C Int Wildcard (T_B Int T_A)) (T_B Int T_A))