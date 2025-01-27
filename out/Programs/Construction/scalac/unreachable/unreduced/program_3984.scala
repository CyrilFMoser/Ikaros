package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[T_B[D, D]], c: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: (T_A[Byte],T_A[Int]), b: CC_A[F]) extends T_A[F]
case class CC_D[G]() extends T_B[G, Byte]
case class CC_E[H](a: (T_B[Byte, Byte],Char), b: H) extends T_B[H, Byte]
case class CC_F[I](a: T_A[CC_B[I]], b: T_A[Byte]) extends T_B[I, Byte]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(), _), _) => 1 
  case CC_A(_, CC_B(), _) => 2 
  case CC_A(_, CC_C((_,_), _), _) => 3 
  case CC_B() => 4 
  case CC_C(_, CC_A(_, CC_A(_, _, _), _)) => 5 
  case CC_C(_, CC_A(_, CC_B(), _)) => 6 
  case CC_C(_, CC_A(_, CC_C(_, _), _)) => 7 
}
}
// This is not matched: CC_A(_, CC_A(_, CC_C(_, _), _), _)