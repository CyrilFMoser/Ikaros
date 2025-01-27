package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[Int, D], D], b: T_A[D, T_B[D]], c: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E]() extends T_B[E]
case class CC_C[F](a: T_B[F], b: F, c: CC_A[F]) extends T_B[F]
case class CC_D(a: T_A[CC_B[Int], T_B[CC_B[Int]]], b: (Char,T_B[Byte])) extends T_B[T_B[(Byte,Int)]]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, CC_A(_, CC_A(_, _, _), CC_B())) => 1 
  case CC_C(CC_C(CC_B(), 12, CC_A(_, _, _)), _, CC_A(_, CC_A(_, _, _), CC_B())) => 2 
  case CC_C(CC_C(CC_C(_, _, _), 12, CC_A(_, _, _)), _, CC_A(_, CC_A(_, _, _), CC_B())) => 3 
  case CC_C(CC_C(CC_B(), _, CC_A(_, _, _)), _, CC_A(_, CC_A(_, _, _), CC_B())) => 4 
  case CC_C(CC_C(CC_C(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, CC_A(_, _, _), CC_B())) => 5 
  case CC_C(CC_B(), _, CC_A(_, CC_A(_, _, _), CC_C(_, _, _))) => 6 
  case CC_C(CC_C(CC_B(), 12, CC_A(_, _, _)), _, CC_A(_, CC_A(_, _, _), CC_C(_, _, _))) => 7 
  case CC_C(CC_C(CC_C(_, _, _), 12, CC_A(_, _, _)), _, CC_A(_, CC_A(_, _, _), CC_C(_, _, _))) => 8 
  case CC_C(CC_C(CC_B(), _, CC_A(_, _, _)), _, CC_A(_, CC_A(_, _, _), CC_C(_, _, _))) => 9 
}
}
// This is not matched: CC_C(CC_C(CC_C(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, CC_A(_, _, _), CC_C(_, _, _)))