package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Byte,T_A[Boolean, Byte]), b: T_B[E, E], c: T_A[Char, E]) extends T_A[Char, E]
case class CC_B[F]() extends T_A[Char, F]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, CC_A(_, _, _)) => 0 
  case CC_A((_,_), _, CC_B()) => 1 
  case CC_B() => 2 
}
}