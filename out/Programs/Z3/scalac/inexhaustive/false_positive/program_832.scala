package Program_28 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E, F](a: F, b: E, c: (Byte,Char)) extends T_B[T_A[(Char,Boolean)], E]
case class CC_C[G]() extends T_B[T_A[(Char,Boolean)], G]
case class CC_D[H, I](a: T_B[I, Boolean], b: ((Byte,Byte),Int), c: T_B[H, H]) extends T_B[H, Boolean]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _, _), ((_,_),_), _) => 0 
}
}
// This is not matched: (CC_D Byte Boolean Wildcard Wildcard Wildcard (T_B Byte Boolean))
// This is not matched: (CC_A T_B (T_A Boolean T_B))