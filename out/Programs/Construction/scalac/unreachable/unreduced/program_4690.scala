package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: F, b: (T_A[Char, Boolean],T_B[Int, Boolean])) extends T_A[F, E]
case class CC_B[G, H](a: Int) extends T_A[H, G]
case class CC_C[I](a: T_A[T_A[CC_A[T_B[Boolean, Int], Char], CC_A[T_B[Boolean, Int], Char]], CC_A[T_B[Boolean, Int], Char]]) extends T_A[T_A[I, I], I]
case class CC_D[K](a: CC_C[K], b: T_A[K, K], c: Char) extends T_B[CC_B[T_B[Int, Char], CC_C[Boolean]], K]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),_)) => 0 
  case CC_A(_, (CC_B(_),_)) => 1 
  case CC_B(_) => 2 
}
}