package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_B[(Char,Char), T_A[Int, Char]]]
case class CC_B() extends T_A[T_A[CC_A[Char], Int], T_B[(Char,Char), T_A[Int, Char]]]
case class CC_C[G, F](a: T_B[F, F]) extends T_B[G, F]
case class CC_D[I, H](a: I) extends T_B[H, I]
case class CC_E[J, K](a: CC_C[K, J], b: T_A[K, K], c: CC_A[J]) extends T_B[J, K]

val v_a: T_B[Byte, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
  case CC_C(CC_C(CC_D(_))) => 1 
  case CC_C(CC_C(CC_E(_, _, _))) => 2 
  case CC_C(CC_E(CC_C(_), _, CC_A(_))) => 3 
  case CC_D(CC_B()) => 4 
  case CC_E(_, _, _) => 5 
}
}
// This is not matched: CC_C(CC_D(_))