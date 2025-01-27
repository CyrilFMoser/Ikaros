package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[E, D], b: T_A[D, C]) extends T_A[D, C]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Byte Char Boolean Wildcard Wildcard (T_A Byte Char))
// This is not matched: (CC_A (Tuple Byte Byte)
//      (CC_A (Tuple Byte Byte) Wildcard Wildcard (T_A (Tuple Byte Byte)))
//      Wildcard
//      (T_A (Tuple Byte Byte)))