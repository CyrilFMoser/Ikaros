package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: Char) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E], c: T_B[T_A[E], E]) extends T_A[E]
case class CC_C(a: T_B[CC_A[Char], T_A[Boolean]], b: T_B[Char, T_A[Byte]]) extends T_B[T_B[Char, Int], CC_A[T_B[(Byte,Char), Char]]]
case class CC_D[F]() extends T_B[CC_C, F]
case class CC_E[G](a: T_B[(CC_C,CC_C), G], b: CC_A[G]) extends T_B[(CC_C,CC_C), G]

val v_a: T_A[T_B[T_B[Char, Int], CC_A[T_B[(Byte,Char), Char]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, 'x'), _) => 0 
  case CC_A(CC_A(_, _), _) => 1 
  case CC_A(CC_B(CC_A(_, _), _, _), _) => 2 
  case CC_A(CC_B(CC_B(_, _, _), _, _), _) => 3 
  case CC_B(CC_A(CC_A(_, _), _), _, _) => 4 
  case CC_B(CC_A(CC_B(_, _, _), _), _, _) => 5 
  case CC_B(CC_B(CC_A(_, _), _, _), _, _) => 6 
}
}
// This is not matched: CC_B(CC_B(CC_B(_, _, _), _, _), _, _)