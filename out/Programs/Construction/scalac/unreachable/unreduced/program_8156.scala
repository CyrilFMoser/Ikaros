package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[T_A[E, E], E]) extends T_A[F, E]
case class CC_B[G, H](a: T_A[G, T_A[G, H]], b: G) extends T_A[G, Int]
case class CC_C(a: CC_B[T_A[Byte, Int], CC_B[Int, Byte]]) extends T_A[T_B[CC_A[Boolean, (Char,Int)], T_A[Byte, Boolean]], Int]
case class CC_D[I](a: T_A[I, I]) extends T_B[I, T_B[(Byte,CC_C), T_A[CC_C, CC_C]]]

val v_a: T_A[T_B[CC_A[Boolean, (Char,Int)], T_A[Byte, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _)