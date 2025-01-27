package Program_14 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_B, b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Char) extends T_B
case class CC_D(a: CC_C, b: CC_A[(Boolean,Char)]) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_C(_), CC_B()) => 1 
  case CC_A(_, CC_B()) => 2 
  case CC_A(_, CC_A(_, _)) => 3 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A Byte Int (T_A Int Byte))