package Program_15 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[Int], b: D) extends T_A[D, E]
case class CC_B(a: (Boolean,Char)) extends T_A[CC_A[Byte, Byte], T_A[Boolean, Int]]
case class CC_C[G, F]() extends T_A[G, F]
case class CC_D[H](a: H) extends T_B[H]
case class CC_E[I, J](a: Byte) extends T_B[I]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
  case CC_D(_) => 1 
  case CC_E(_) => 2 
  case CC_E(0) => 3 
}
}
// This is not matched: (CC_E Char Boolean Wildcard (T_B Char))
// This is not matched: (CC_A Boolean (Tuple Byte Wildcard) Wildcard (T_A Boolean))