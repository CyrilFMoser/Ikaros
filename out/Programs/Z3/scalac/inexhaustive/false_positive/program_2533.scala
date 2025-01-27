package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: C, b: T_A[D, D]) extends T_A[D, C]
case class CC_B[F]() extends T_A[Byte, F]
case class CC_C[G](a: G, b: T_A[G, G]) extends T_A[Byte, G]

val v_a: CC_A[Byte, Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
  case CC_A(_, CC_C(_, _)) => 2 
}
}
// This is not matched: (CC_A Byte
//      Byte
//      Char
//      Wildcard
//      (CC_A Byte Byte Boolean Wildcard Wildcard (T_A Byte Byte))
//      (T_A Byte Byte))
// This is not matched: (CC_C Wildcard T_B)