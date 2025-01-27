package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[Int, Int], T_A[Char, Byte]]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, T_A[T_A[Int, Int], T_A[Char, Byte]]]

val v_a: T_A[Byte, T_A[T_A[Int, Int], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}