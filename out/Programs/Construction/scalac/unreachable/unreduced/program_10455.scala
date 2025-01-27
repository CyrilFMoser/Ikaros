package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_A[E, Boolean]], b: T_B[E, E], c: T_A[E, E]) extends T_A[E, Boolean]
case class CC_B[F]() extends T_A[Char, F]
case class CC_C[G, H](a: T_B[G, G]) extends T_B[H, G]
case class CC_D[I](a: CC_C[T_B[(Char,Char), I], I], b: CC_C[I, I], c: Byte) extends T_B[I, (T_A[Boolean, Int],CC_B[Int])]
case class CC_E[J, K](a: CC_B[J], b: T_A[Char, J], c: T_A[J, K]) extends T_B[K, J]

val v_a: T_B[Int, (T_A[Boolean, Int],CC_B[Int])] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, CC_C(CC_C(_)), _) => 1 
  case CC_E(_, _, _) => 2 
}
}
// This is not matched: CC_D(_, CC_C(CC_E(_, _, _)), _)