package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[E, E], E]
case class CC_B[F](a: T_B[F, F], b: T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]], c: T_A[T_A[F, F], F]) extends T_A[T_A[F, F], F]
case class CC_C(a: T_B[T_B[Int, Byte], T_A[Int, (Byte,Int)]], b: Boolean, c: T_B[CC_A[Byte], Int]) extends T_A[T_A[T_A[T_A[CC_B[Int], CC_B[Int]], CC_B[Int]], T_A[T_A[CC_B[Int], CC_B[Int]], CC_B[Int]]], T_A[T_A[CC_B[Int], CC_B[Int]], CC_B[Int]]]
case class CC_D[H](a: Int, b: T_B[CC_B[H], H]) extends T_B[CC_B[H], H]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), CC_A()) => 1 
  case CC_B(_, CC_A(), CC_B(_, _, CC_A())) => 2 
  case CC_B(_, CC_A(), CC_B(_, _, CC_B(_, _, _))) => 3 
  case CC_B(_, CC_B(_, CC_A(), CC_A()), CC_A()) => 4 
  case CC_B(_, CC_B(_, CC_A(), CC_A()), CC_B(_, _, CC_A())) => 5 
  case CC_B(_, CC_B(_, CC_A(), CC_A()), CC_B(_, _, CC_B(_, _, _))) => 6 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A()), CC_A()) => 7 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A()), CC_B(_, _, CC_A())) => 8 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A()), CC_B(_, _, CC_B(_, _, _))) => 9 
  case CC_B(_, CC_B(_, CC_A(), CC_B(_, _, _)), CC_A()) => 10 
  case CC_B(_, CC_B(_, CC_A(), CC_B(_, _, _)), CC_B(_, _, CC_A())) => 11 
  case CC_B(_, CC_B(_, CC_A(), CC_B(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 12 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A()) => 13 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, CC_A())) => 14 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 15 
}
}