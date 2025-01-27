package Program_26 

package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: C, b: T_A[(Char,Byte), D]) extends T_A[C, D]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Int Byte Boolean Wildcard Wildcard (T_A Int Byte))
// This is not matched: (CC_B Byte Boolean Wildcard (T_A Byte))