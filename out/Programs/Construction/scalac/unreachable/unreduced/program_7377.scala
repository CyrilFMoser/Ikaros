package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: CC_A[E]) extends T_A[E]
case class CC_C[F, G](a: T_A[CC_B[T_A[Int]]]) extends T_A[F]
case class CC_D(a: T_B[Byte, ((Char,Char),Char)], b: CC_A[CC_B[Int]]) extends T_B[Char, T_A[T_A[Char]]]
case class CC_E(a: T_A[T_A[CC_D]], b: (Byte,T_A[CC_D])) extends T_B[Char, T_A[T_A[Char]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(CC_A(_, _), _)) => 1 
  case CC_A(_, CC_B(CC_B(_, _), _)) => 2 
  case CC_A(_, CC_B(CC_C(_), _)) => 3 
  case CC_A(_, CC_C(CC_A(_, _))) => 4 
  case CC_A(_, CC_C(CC_B(_, _))) => 5 
  case CC_A(_, CC_C(CC_C(_))) => 6 
  case CC_B(CC_A(_, CC_A(_, _)), CC_A(_, CC_A(_, _))) => 7 
  case CC_B(CC_A(_, CC_B(_, _)), CC_A(_, CC_A(_, _))) => 8 
  case CC_B(CC_A(_, CC_C(_)), CC_A(_, CC_A(_, _))) => 9 
  case CC_B(CC_B(CC_A(_, _), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 10 
  case CC_B(CC_B(CC_B(_, _), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 11 
  case CC_B(CC_B(CC_C(_), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 12 
  case CC_B(CC_C(CC_A(_, _)), CC_A(_, CC_A(_, _))) => 13 
  case CC_B(CC_C(CC_B(_, _)), CC_A(_, CC_A(_, _))) => 14 
  case CC_B(CC_C(CC_C(_)), CC_A(_, CC_A(_, _))) => 15 
  case CC_B(CC_A(_, CC_A(_, _)), CC_A(_, CC_B(_, _))) => 16 
  case CC_B(CC_A(_, CC_B(_, _)), CC_A(_, CC_B(_, _))) => 17 
  case CC_B(CC_A(_, CC_C(_)), CC_A(_, CC_B(_, _))) => 18 
  case CC_B(CC_B(CC_A(_, _), CC_A(_, _)), CC_A(_, CC_B(_, _))) => 19 
  case CC_B(CC_B(CC_B(_, _), CC_A(_, _)), CC_A(_, CC_B(_, _))) => 20 
  case CC_B(CC_B(CC_C(_), CC_A(_, _)), CC_A(_, CC_B(_, _))) => 21 
  case CC_B(CC_C(CC_A(_, _)), CC_A(_, CC_B(_, _))) => 22 
  case CC_B(CC_C(CC_B(_, _)), CC_A(_, CC_B(_, _))) => 23 
  case CC_B(CC_C(CC_C(_)), CC_A(_, CC_B(_, _))) => 24 
  case CC_B(CC_A(_, CC_A(_, _)), CC_A(_, CC_C(_))) => 25 
  case CC_B(CC_A(_, CC_B(_, _)), CC_A(_, CC_C(_))) => 26 
  case CC_B(CC_A(_, CC_C(_)), CC_A(_, CC_C(_))) => 27 
  case CC_B(CC_B(CC_A(_, _), CC_A(_, _)), CC_A(_, CC_C(_))) => 28 
  case CC_B(CC_B(CC_B(_, _), CC_A(_, _)), CC_A(_, CC_C(_))) => 29 
  case CC_B(CC_B(CC_C(_), CC_A(_, _)), CC_A(_, CC_C(_))) => 30 
  case CC_B(CC_C(CC_A(_, _)), CC_A(_, CC_C(_))) => 31 
  case CC_B(CC_C(CC_C(_)), CC_A(_, CC_C(_))) => 32 
  case CC_C(CC_A(_, CC_A(_, _))) => 33 
  case CC_C(CC_A(_, CC_B(_, _))) => 34 
  case CC_C(CC_A(_, CC_C(_))) => 35 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _))) => 36 
  case CC_C(CC_B(CC_B(_, _), CC_A(_, _))) => 37 
  case CC_C(CC_B(CC_C(_), CC_A(_, _))) => 38 
  case CC_C(CC_C(CC_A(_, _))) => 39 
  case CC_C(CC_C(CC_B(_, _))) => 40 
  case CC_C(CC_C(CC_C(_))) => 41 
}
}
// This is not matched: CC_B(CC_C(CC_B(_, _)), CC_A(_, CC_C(_)))