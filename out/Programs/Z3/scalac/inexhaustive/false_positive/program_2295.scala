package Program_31 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A]() extends T_A
case class CC_B(a: (T_B,Char), b: T_A) extends T_A
case class CC_C(a: Char, b: CC_A[CC_B]) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, _) => 2 
  case CC_B((CC_C(_, _),'x'), CC_B(_, _)) => 3 
  case CC_B((CC_C(_, _),_), _) => 4 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_A T_A)