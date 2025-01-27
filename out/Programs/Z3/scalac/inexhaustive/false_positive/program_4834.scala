package Program_12 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: D, b: Byte, c: T_A[D, C]) extends T_A[C, D]
case class CC_B[F, E](a: T_A[Byte, E]) extends T_A[F, E]
case class CC_C[G, H](a: T_A[G, H], b: H, c: H) extends T_A[G, H]
case class CC_D(a: (T_B,(Byte,Byte)), b: CC_B[T_B, (Int,Char)]) extends T_B
case class CC_E[I](a: Boolean, b: I, c: T_A[I, I]) extends T_B
case class CC_F(a: CC_C[CC_D, Boolean], b: T_A[CC_D, CC_D]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((CC_F(_, _),(_,_)), CC_B(_)) => 0 
  case CC_D((CC_F(_, _),(_,_)), _) => 1 
  case CC_D((CC_D(_, _),(_,_)), CC_B(_)) => 2 
}
}
// This is not matched: (CC_D (Tuple (CC_E T_B Wildcard Wildcard Wildcard T_B) Wildcard) Wildcard T_B)
// This is not matched: (CC_E T_B)