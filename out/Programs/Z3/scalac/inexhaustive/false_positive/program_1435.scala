package Program_31 

package Program_11 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Int) extends T_A
case class CC_B[A](a: T_A, b: CC_A, c: CC_A) extends T_A

val v_a: CC_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, _) => 0 
  case CC_B(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)) => 1 
  case CC_B(CC_A(_, _), _, CC_A(_, _)) => 2 
}
}
// This is not matched: (CC_B (CC_A T_A (CC_A T_A T_A T_A) T_A)
//      (CC_B T_A Wildcard (CC_A Wildcard Int T_A) Wildcard T_A)
//      Wildcard
//      Wildcard
//      T_A)
// This is not matched: Pattern match is empty without constants