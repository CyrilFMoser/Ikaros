package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: (T_A[Int, Char],(Boolean,Char)), c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_B[E, F](a: T_A[F, F]) extends T_A[E, T_A[E, E]]
case class CC_C[G](a: CC_B[G, G], b: T_A[G, T_A[G, G]]) extends T_B[G]
case class CC_D[H, I]() extends T_B[H]
case class CC_E[J](a: CC_A[J]) extends T_B[J]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_), CC_A(_, _, _)) => 0 
  case CC_C(CC_B(_), CC_B(_)) => 1 
  case CC_D() => 2 
}
}
// This is not matched: CC_E(CC_A(_, _, _))