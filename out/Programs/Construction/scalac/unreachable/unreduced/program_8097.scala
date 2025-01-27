package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Char]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C[H](a: H, b: T_B[H, H], c: H) extends T_B[H, Int]
case class CC_D[I](a: I, b: T_A[I, I]) extends T_B[I, Int]
case class CC_E(a: T_A[T_B[Char, Int], Char], b: CC_A[CC_A[Int]]) extends T_B[T_A[CC_B[Byte, (Int,Char)], Char], Int]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, CC_A()) => 1 
}
}
// This is not matched: CC_D(_, CC_B())