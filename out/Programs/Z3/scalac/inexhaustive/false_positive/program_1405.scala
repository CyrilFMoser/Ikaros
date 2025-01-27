package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: E, b: F, c: T_A[D, Byte]) extends T_A[E, D]
case class CC_B[G](a: ((Char,Boolean),Boolean), b: G, c: G) extends T_B[G]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Char Byte Boolean Wildcard Wildcard Wildcard (T_A Char Byte))
// This is not matched: (CC_A Char Byte Boolean Wildcard Wildcard Wildcard (T_A Char Byte))