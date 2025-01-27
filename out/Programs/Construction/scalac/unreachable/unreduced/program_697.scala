package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[T_A[T_B[Char, Byte], T_A[Int, Int]], E]
case class CC_B[F, G](a: T_A[G, F], b: T_A[CC_A[G], G]) extends T_B[G, F]
case class CC_C[H](a: T_B[H, Char], b: H) extends T_B[H, Char]
case class CC_D[I](a: I, b: I) extends T_B[CC_C[T_B[Char, Boolean]], I]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_B(_, _), true) => 1 
  case CC_C(CC_C(_, _), true) => 2 
  case CC_C(CC_B(_, _), false) => 3 
  case CC_C(CC_C(_, _), false) => 4 
}
}