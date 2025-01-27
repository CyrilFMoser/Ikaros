package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (Char,T_B[Byte, Char])) extends T_A[D]
case class CC_B[E](a: T_A[E], b: E, c: E) extends T_A[E]
case class CC_C[F](a: T_B[T_B[F, F], F], b: F) extends T_B[T_B[F, F], F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_A(_), _, _) => 1 
  case CC_B(CC_B(CC_A(_), _, _), _, _) => 2 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 3 
}
}