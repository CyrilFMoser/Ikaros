package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[Char, Int], T_A[Byte, Char]]]
case class CC_B[D](a: T_A[D, D], b: Char, c: D) extends T_A[D, T_A[T_A[Char, Int], T_A[Byte, Char]]]
case class CC_C[E](a: E) extends T_A[E, T_A[T_A[Char, Int], T_A[Byte, Char]]]

val v_a: T_A[Int, T_A[T_A[Char, Int], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}