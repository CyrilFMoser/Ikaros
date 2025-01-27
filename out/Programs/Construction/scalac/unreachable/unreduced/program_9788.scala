package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F], b: T_B[F, F], c: Char) extends T_A[F, E]
case class CC_B[H, G](a: T_A[G, G], b: CC_A[G, H]) extends T_A[H, G]
case class CC_C[I](a: I) extends T_B[I, T_A[I, I]]
case class CC_D(a: T_B[CC_A[Boolean, Int], CC_C[Int]]) extends T_B[CC_A[T_A[Int, Int], Boolean], T_A[CC_A[T_A[Int, Int], Boolean], CC_A[T_A[Int, Int], Boolean]]]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}