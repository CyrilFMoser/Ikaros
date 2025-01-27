package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Int, c: T_A[D, D]) extends T_A[T_B[D], D]
case class CC_B[E, F](a: F) extends T_A[T_B[E], E]
case class CC_C[G]() extends T_A[G, T_A[T_B[(Boolean,Byte)], CC_B[Byte, Int]]]
case class CC_D[H](a: Boolean) extends T_B[H]

val v_a: T_A[T_B[Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}