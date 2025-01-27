package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C]) extends T_A[C, T_A[T_A[T_B, Int], T_A[T_B, Char]]]
case class CC_B[D](a: Byte, b: T_B) extends T_A[D, T_A[T_A[T_B, Int], T_A[T_B, Char]]]
case class CC_C[E](a: Char, b: E) extends T_A[E, T_A[T_A[T_B, Int], T_A[T_B, Char]]]

val v_a: T_A[Int, T_A[T_A[T_B, Int], T_A[T_B, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}