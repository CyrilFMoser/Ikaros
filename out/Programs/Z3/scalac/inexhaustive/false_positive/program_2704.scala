package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[Byte, Char]]
case class CC_B[F]() extends T_A[F, T_B[Byte, Char]]
case class CC_C[G, H](a: CC_A[G], b: T_B[G, Byte], c: Char) extends T_A[G, T_B[Byte, Char]]

val v_a: T_A[Char, T_B[Byte, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(CC_A(), _, 'x') => 2 
  case CC_C(_, _, 'x') => 3 
  case CC_C(CC_A(), _, _) => 4 
  case CC_C(_, _, _) => 5 
}
}
// This is not matched: (CC_C Char Boolean Wildcard Wildcard Char (T_A Char (T_B Byte Char)))
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)