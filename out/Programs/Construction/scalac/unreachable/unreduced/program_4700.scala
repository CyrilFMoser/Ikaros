package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Byte, c: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]
case class CC_C(a: T_B[CC_B[(Boolean,Int)], CC_A[Char]], b: Boolean, c: T_A[T_B[Int, Byte], T_A[T_B[Int, Byte], T_B[Int, Byte]]]) extends T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]]]]
case class CC_D[H, G](a: G, b: H) extends T_B[G, H]
case class CC_E[I](a: T_B[I, I]) extends T_B[T_A[CC_A[CC_C], T_A[CC_A[CC_C], CC_A[CC_C]]], I]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_B(CC_B(_)) => 1 
}
}