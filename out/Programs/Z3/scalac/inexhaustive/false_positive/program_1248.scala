package Program_28 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: E, b: (Boolean,Int), c: T_A[E]) extends T_A[E]
case class CC_C[F, G](a: CC_A[G]) extends T_B[F, G]
case class CC_D[H, I]() extends T_B[Boolean, H]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
}
}
// This is not matched: (CC_D Int Boolean (T_B Boolean Int))
// This is not matched: (CC_A (CC_C Boolean Boolean Boolean) (T_A (CC_C Boolean Boolean Boolean)))