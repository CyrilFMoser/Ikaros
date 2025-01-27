package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, E], b: T_A[E, E]) extends T_A[F, E]
case class CC_B[G](a: T_A[G, G], b: T_A[G, Byte]) extends T_A[G, Byte]
case class CC_C[H](a: T_A[H, Byte], b: H) extends T_B[T_B[CC_A[(Int,Char), Char], Boolean], H]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}