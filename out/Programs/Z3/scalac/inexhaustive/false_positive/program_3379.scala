package Program_15 

package Program_12 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B[A]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 2 
  case CC_A(_, _, _) => 3 
  case CC_A(_, CC_B(), _) => 4 
  case CC_A(CC_B(), CC_B(), CC_B()) => 5 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_D (CC_C Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      (T_B (CC_C Boolean Boolean Boolean)))