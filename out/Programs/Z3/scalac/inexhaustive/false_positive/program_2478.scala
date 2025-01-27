package Program_31 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C[A](a: T_B, b: T_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_)) => 0 
  case CC_C(_, _) => 1 
  case CC_C(CC_C(_, _), CC_A(_)) => 2 
  case CC_C(CC_C(_, _), _) => 3 
}
}
// This is not matched: (CC_C T_A Wildcard (CC_B Wildcard T_A) T_B)
// This is not matched: Pattern match is empty without constants