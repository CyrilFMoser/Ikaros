package Program_31 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E]) extends T_A[T_B[Char, (Int,Boolean)], E]
case class CC_B[F](a: F) extends T_B[T_A[F, F], F]
case class CC_C[H, G, I](a: I, b: (Byte,Int), c: I) extends T_B[G, H]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_C(_, (_,_), _) => 1 
}
}
// This is not matched: (CC_C Byte Boolean Boolean Wildcard (Tuple Byte Int) Boolean (T_B Boolean Byte))
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)