package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[(Boolean,T_B[Int, (Byte,Boolean)]), E]
case class CC_B(a: T_B[T_A[Int, Byte], CC_A[Char]], b: Byte, c: Boolean) extends T_A[(Boolean,T_B[Int, (Byte,Boolean)]), T_A[Char, (Boolean,Char)]]
case class CC_C[G, F](a: Char, b: T_B[F, CC_B]) extends T_B[F, G]

val v_a: CC_A[T_A[(Boolean,T_B[Int, (Byte,Boolean)]), T_A[Char, (Boolean,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, true)) => 1 
  case CC_A(CC_B(_, _, false)) => 2 
}
}