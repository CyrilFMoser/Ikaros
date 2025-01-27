package Program_30 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: Char) extends T_A[D, C]
case class CC_B[F, E](a: T_A[F, E]) extends T_A[E, F]
case class CC_C[G, H, I](a: CC_B[G, G]) extends T_A[G, H]
case class CC_D(a: Boolean, b: T_A[T_B, T_B], c: CC_B[(Char,Char), Char]) extends T_B
case class CC_E() extends T_B
case class CC_F[J](a: CC_E, b: J, c: CC_E) extends T_B

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
  case CC_A(_) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_A(_)) => 3 
  case CC_B(CC_C(_)) => 4 
  case CC_C(CC_B(_)) => 5 
}
}
// This is not matched: (CC_C Char Int T_B Wildcard (T_A Char Int))
// This is not matched: (CC_B Wildcard Wildcard T_A)