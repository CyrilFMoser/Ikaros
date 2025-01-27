package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G, H](a: H, b: T_A[H, G]) extends T_A[G, H]
case class CC_C[I](a: T_A[I, T_B[I, I]], b: T_A[I, I], c: T_A[I, T_B[I, I]]) extends T_B[T_A[I, I], I]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_A(), CC_A()) => 0 
  case CC_C(CC_A(), CC_B(_, CC_A()), CC_A()) => 1 
  case CC_C(CC_A(), CC_B(_, CC_B(_, _)), CC_A()) => 2 
  case CC_C(CC_B(_, CC_A()), CC_A(), CC_A()) => 3 
  case CC_C(CC_B(_, CC_A()), CC_B(_, CC_A()), CC_A()) => 4 
  case CC_C(CC_B(_, CC_A()), CC_B(_, CC_B(_, _)), CC_A()) => 5 
  case CC_C(CC_B(_, CC_B(_, _)), CC_A(), CC_A()) => 6 
  case CC_C(CC_B(_, CC_B(_, _)), CC_B(_, CC_A()), CC_A()) => 7 
  case CC_C(CC_B(_, CC_B(_, _)), CC_B(_, CC_B(_, _)), CC_A()) => 8 
  case CC_C(CC_A(), CC_A(), CC_B(_, CC_A())) => 9 
  case CC_C(CC_A(), CC_B(_, CC_A()), CC_B(_, CC_A())) => 10 
  case CC_C(CC_A(), CC_B(_, CC_B(_, _)), CC_B(_, CC_A())) => 11 
  case CC_C(CC_B(_, CC_A()), CC_A(), CC_B(_, CC_A())) => 12 
  case CC_C(CC_B(_, CC_A()), CC_B(_, CC_A()), CC_B(_, CC_A())) => 13 
  case CC_C(CC_B(_, CC_A()), CC_B(_, CC_B(_, _)), CC_B(_, CC_A())) => 14 
  case CC_C(CC_B(_, CC_B(_, _)), CC_A(), CC_B(_, CC_A())) => 15 
  case CC_C(CC_B(_, CC_B(_, _)), CC_B(_, CC_A()), CC_B(_, CC_A())) => 16 
  case CC_C(CC_B(_, CC_B(_, _)), CC_B(_, CC_B(_, _)), CC_B(_, CC_A())) => 17 
  case CC_C(CC_A(), CC_A(), CC_B(_, CC_B(_, _))) => 18 
  case CC_C(CC_A(), CC_B(_, CC_A()), CC_B(_, CC_B(_, _))) => 19 
  case CC_C(CC_A(), CC_B(_, CC_B(_, _)), CC_B(_, CC_B(_, _))) => 20 
  case CC_C(CC_B(_, CC_A()), CC_A(), CC_B(_, CC_B(_, _))) => 21 
  case CC_C(CC_B(_, CC_A()), CC_B(_, CC_B(_, _)), CC_B(_, CC_B(_, _))) => 22 
  case CC_C(CC_B(_, CC_B(_, _)), CC_A(), CC_B(_, CC_B(_, _))) => 23 
  case CC_C(CC_B(_, CC_B(_, _)), CC_B(_, CC_A()), CC_B(_, CC_B(_, _))) => 24 
  case CC_C(CC_B(_, CC_B(_, _)), CC_B(_, CC_B(_, _)), CC_B(_, CC_B(_, _))) => 25 
}
}
// This is not matched: CC_C(CC_B(_, CC_A()), CC_B(_, CC_A()), CC_B(_, CC_B(_, _)))