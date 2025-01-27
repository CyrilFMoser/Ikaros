package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, Int]
case class CC_B[F, G](a: T_A[G, (Boolean,Char)]) extends T_B[F, G]
case class CC_C[I, H](a: Int, b: Byte, c: T_B[I, H]) extends T_B[H, I]
case class CC_D[J, K]() extends T_B[J, K]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, CC_B(_)) => 1 
  case CC_C(_, _, CC_C(_, _, CC_B(_))) => 2 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 3 
  case CC_C(_, _, CC_C(_, _, CC_D())) => 4 
  case CC_D() => 5 
}
}
// This is not matched: CC_C(_, _, CC_D())