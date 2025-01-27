package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F], b: T_B[F, E], c: F) extends T_A[F, E]
case class CC_B[G, H]() extends T_A[G, H]
case class CC_C[I](a: T_A[I, I], b: (T_A[Int, Byte],CC_B[Char, Int])) extends T_B[CC_B[I, I], I]
case class CC_D[J](a: T_A[J, J], b: T_B[CC_B[J, J], J], c: T_A[J, J]) extends T_B[CC_B[J, J], J]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}