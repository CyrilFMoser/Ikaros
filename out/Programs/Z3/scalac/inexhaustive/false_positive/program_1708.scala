package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: C) extends T_A[C]
case class CC_B[E](a: T_A[E], b: E) extends T_A[E]
case class CC_C[F](a: Boolean, b: CC_A[F, F], c: F) extends T_B[F]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_B(_, _), _) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: Pattern match is empty without constants