package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: Int, c: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: C, b: C) extends T_A[C]
case class CC_C() extends T_A[CC_A[Byte]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
  case CC_A(_, _, CC_B(_, _)) => 2 
  case CC_A(_, 12, CC_B(_, _)) => 3 
  case CC_A(_, _, _) => 4 
  case CC_A(_, 12, CC_A(_, _, _)) => 5 
}
}
// This is not matched: (CC_B Byte Boolean Wildcard Byte (T_A Byte))
// This is not matched: (CC_B Byte Byte (T_A (CC_A Byte Byte (T_A Boolean Boolean) Boolean) Byte))