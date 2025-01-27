package Program_29 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[T_B, D], b: T_A[Char, Char], c: Byte) extends T_A[Char, C]
case class CC_B[E]() extends T_A[Char, E]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, _) => 1 
  case CC_A(_, _, 0) => 2 
}
}
// This is not matched: (CC_A Char (T_A T_B T_B) Wildcard Wildcard Wildcard (T_A Char Char))
// This is not matched: (CC_B Byte
//      (T_B (T_A Boolean Int) (CC_B Char Char Boolean Boolean Boolean))
//      Wildcard
//      Wildcard
//      (T_A Byte
//           (T_B (T_A Boolean Int) (CC_B Char Char Boolean Boolean Boolean))))