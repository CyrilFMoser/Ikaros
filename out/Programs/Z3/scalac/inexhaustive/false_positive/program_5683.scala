package Program_15 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A
case class CC_B[A](a: A) extends T_B
case class CC_C() extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
  case CC_A(CC_B(_), CC_B(_)) => 1 
  case CC_A(CC_B(_), CC_C()) => 2 
  case CC_A(CC_C(), CC_B(_)) => 3 
}
}
// This is not matched: (CC_A (CC_B Boolean Boolean T_B) Wildcard T_A)
// This is not matched: Pattern match is empty without constants