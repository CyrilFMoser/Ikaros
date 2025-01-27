package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[Boolean, T_A[Byte, Int]], Int], b: E) extends T_A[E, Int]
case class CC_B[G](a: CC_A[G], b: T_B[G, G]) extends T_A[G, Int]
case class CC_C() extends T_A[T_B[T_B[Boolean, Boolean], T_A[Int, Int]], Int]
case class CC_D[H, I](a: T_A[H, Int], b: Boolean, c: CC_A[CC_C]) extends T_B[H, I]
case class CC_E[K, J]() extends T_B[J, K]

val v_a: T_B[T_A[T_B[T_B[Boolean, Boolean], T_A[Int, Int]], Int], Char] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A(CC_A(_, _), CC_C())) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_D(_, _, CC_A(CC_B(_, _), CC_C()))