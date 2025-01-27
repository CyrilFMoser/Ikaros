package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, (Int,Byte)], b: T_A[E, E], c: Int) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: F) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: T_B[G, G]) extends T_B[T_A[G, T_B[G, G]], G]
case class CC_D[H, I](a: CC_C[H]) extends T_B[H, I]
case class CC_E[J]() extends T_B[CC_D[CC_C[Byte], (Int,Int)], J]

val v_a: T_A[Int, T_B[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}