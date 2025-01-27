package Program_29 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, E], b: F) extends T_A[T_A[Boolean, Int], E]
case class CC_B[G](a: CC_A[G, G], b: ((Boolean,Char),Byte)) extends T_A[T_A[Boolean, Int], G]
case class CC_C[H](a: CC_B[H], b: CC_A[H, H]) extends T_A[H, CC_A[H, H]]
case class CC_D[I, J](a: Int) extends T_B[I, J]
case class CC_E[K](a: T_B[K, K], b: CC_C[K]) extends T_B[T_B[Byte, Byte], K]

val v_a: T_A[T_A[Boolean, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_), _) => 0 
  case CC_B(_, _) => 1 
  case CC_B(CC_A(_, _), ((_,_),_)) => 2 
}
}
// This is not matched: (CC_A Int Byte Wildcard Byte (T_A (T_A Boolean Int) Int))
// This is not matched: Pattern match is empty without constants