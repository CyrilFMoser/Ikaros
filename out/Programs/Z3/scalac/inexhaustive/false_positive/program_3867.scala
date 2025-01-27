package Program_15 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, T_A[D, D]]
case class CC_B(a: T_A[Boolean, Char]) extends T_B[CC_A[Boolean]]
case class CC_C[E](a: E) extends T_B[E]
case class CC_D[F, G](a: (CC_B,CC_B)) extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
  case CC_C(_) => 1 
  case CC_D((CC_B(_),CC_B(_))) => 2 
}
}
// This is not matched: (CC_D Char Boolean Wildcard (T_B Char))
// This is not matched: (CC_B Int T_B T_B Wildcard (T_A T_B Int))