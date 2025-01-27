package Program_15 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, E]) extends T_A[E, (Int,(Boolean,Int))]
case class CC_B[G](a: CC_A[G, G], b: Boolean) extends T_A[G, (Int,(Boolean,Int))]
case class CC_C[H](a: H, b: T_A[H, H]) extends T_A[H, (Int,(Boolean,Int))]
case class CC_D[I, J](a: T_A[J, I]) extends T_B[I, J]
case class CC_E[K, L](a: CC_C[K], b: (Boolean,Boolean), c: T_B[K, L]) extends T_B[K, L]

val v_a: T_A[Int, (Int,(Boolean,Int))] = null
val v_b: Int = v_a match{
  case CC_C(12, _) => 0 
  case CC_C(_, _) => 1 
  case CC_B(CC_A(_), _) => 2 
  case CC_A(_) => 3 
}
}
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int (Tuple Int (Tuple Boolean Int))))
// This is not matched: (CC_C Wildcard T_B)