package Program_31 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[Char, E], b: E) extends T_A[E, T_B[E, E]]
case class CC_B[G, F](a: F, b: T_B[G, F]) extends T_B[G, F]
case class CC_C[H, I, J]() extends T_B[H, I]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(0, _) => 1 
  case CC_B(0, CC_C()) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: (CC_C Boolean Byte Boolean (T_B Boolean Byte))
// This is not matched: (CC_C Boolean Wildcard Wildcard (T_B Boolean))