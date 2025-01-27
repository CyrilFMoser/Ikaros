package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: F, b: F, c: T_A[F, Char]) extends T_A[F, Char]
case class CC_C[G]() extends T_A[G, Char]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, CC_B(_, _, _))) => 0 
}
}
// This is not matched: CC_B((_,CC_B(_)))