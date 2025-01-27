package Program_15 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C], b: C) extends T_A[C, D]
case class CC_B[E, F, G](a: G, b: T_A[E, E]) extends T_A[E, F]

val v_a: CC_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _), _) => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_A Char
//      Byte
//      (CC_B Char Char Boolean Wildcard Wildcard (T_A Char Char))
//      Wildcard
//      (T_A Char Byte))
// This is not matched: (CC_B Wildcard T_A)