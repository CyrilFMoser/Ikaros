package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, E], b: T_B[E, F], c: Char) extends T_A[E, F]
case class CC_B[G, H]() extends T_A[H, G]
case class CC_C[I](a: CC_B[I, I], b: I) extends T_A[I, Byte]
case class CC_D[J](a: T_B[J, J]) extends T_B[T_B[J, J], J]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B(), _) => 2 
}
}