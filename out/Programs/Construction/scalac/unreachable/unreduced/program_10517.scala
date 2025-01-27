package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: T_A[Byte, D]) extends T_A[Byte, D]
case class CC_B[E](a: (T_B[Byte],T_A[Byte, Int]), b: T_A[Byte, E], c: E) extends T_A[Byte, E]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: T_B[T_A[Byte, Boolean]], b: G) extends T_B[G]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _, _))) => 1 
  case CC_A(_, _, CC_B((_,_), _, 'x')) => 2 
  case CC_A(_, _, CC_B((_,_), _, _)) => 3 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), _) => 4 
  case CC_B(_, CC_A(_, _, CC_B(_, _, _)), _) => 5 
  case CC_B(_, CC_B(_, _, _), _) => 6 
}
}