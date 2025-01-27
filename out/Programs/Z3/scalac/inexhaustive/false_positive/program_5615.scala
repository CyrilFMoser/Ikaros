package Program_14 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C) extends T_A[T_B, C]
case class CC_B[D](a: T_B, b: D, c: Byte) extends T_A[T_B, D]
case class CC_C[F, E](a: Byte, b: T_B) extends T_A[F, E]
case class CC_D[G](a: T_A[T_B, G]) extends T_B
case class CC_E(a: T_A[T_B, T_B], b: (T_B,T_B)) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_C(_, _), (CC_D(_),CC_E(_, _))) => 0 
  case CC_E(CC_A(_, _), (CC_D(_),CC_D(_))) => 1 
  case CC_E(_, (CC_E(_, _),CC_D(_))) => 2 
  case CC_E(_, (CC_D(_),CC_D(_))) => 3 
  case CC_E(_, (CC_E(_, _),CC_E(_, _))) => 4 
}
}
// This is not matched: (CC_E Wildcard
//      (Tuple (CC_D (T_A T_B T_B) Wildcard T_B)
//             (CC_D (Generic "G") Wildcard T_B))
//      T_B)
// This is not matched: Pattern match is empty without constants