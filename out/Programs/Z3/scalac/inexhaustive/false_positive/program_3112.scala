package Program_15 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_B) extends T_A
case class CC_B() extends T_B
case class CC_C(a: T_A, b: T_A) extends T_B
case class CC_D[A]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D() => 1 
  case CC_C(_, CC_A(_, _, _)) => 2 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _)) => 3 
}
}
// This is not matched: (CC_D T_A T_B)
// This is not matched: (CC_B Wildcard
//      (CC_B Wildcard (CC_C Wildcard Wildcard T_A) Wildcard T_A)
//      Wildcard
//      T_A)