package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E], c: T_A[E, E]) extends T_A[(Boolean,T_B[Char, Boolean]), E]
case class CC_B[F](a: Byte) extends T_A[(Boolean,T_B[Char, Boolean]), F]

val v_a: T_A[(Boolean,T_B[Char, Boolean]), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(0) => 1 
  case CC_B(_) => 2 
}
}