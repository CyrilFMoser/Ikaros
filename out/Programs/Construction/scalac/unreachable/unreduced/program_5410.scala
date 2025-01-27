package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G](a: G, b: T_A[E, F], c: T_A[T_A[E, E], G]) extends T_A[E, F]
case class CC_B[H](a: T_A[H, H], b: T_A[H, H], c: T_A[H, H]) extends T_A[H, Char]
case class CC_C[I](a: I, b: T_A[I, I], c: CC_B[I]) extends T_B[T_A[CC_B[Boolean], Char], Byte]
case class CC_D(a: T_B[T_A[Int, Char], T_A[Char, Boolean]], b: T_A[T_A[Int, Byte], (Boolean,Boolean)], c: CC_A[T_A[Byte, Byte], T_A[Int, Int], (Char,Boolean)]) extends T_B[T_A[CC_B[Boolean], Char], Byte]
case class CC_E() extends T_B[T_A[CC_B[Boolean], Char], Byte]

val v_a: T_B[T_A[CC_B[Boolean], Char], Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E() => 2 
}
}