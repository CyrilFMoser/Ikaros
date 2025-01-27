package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: Boolean, c: T_A[Byte, T_B]) extends T_A[Byte, C]
case class CC_B[D](a: D, b: D) extends T_A[Byte, D]
case class CC_C[E](a: CC_B[E], b: T_A[E, E]) extends T_A[Byte, E]
case class CC_D(a: T_B, b: T_A[Byte, CC_C[T_B]]) extends T_B
case class CC_E() extends T_B
case class CC_F[F](a: F) extends T_B

val v_a: T_A[Byte, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _), _, _) => 0 
  case CC_B(CC_D(_, CC_A(_, _, _)), CC_D(CC_D(_, _), CC_A(_, _, _))) => 1 
  case CC_B(CC_D(_, CC_A(_, _, _)), CC_D(CC_E(), CC_A(_, _, _))) => 2 
  case CC_B(CC_D(_, CC_A(_, _, _)), CC_D(CC_F(_), CC_A(_, _, _))) => 3 
  case CC_B(CC_D(_, CC_A(_, _, _)), CC_D(CC_D(_, _), CC_B(_, _))) => 4 
  case CC_B(CC_D(_, CC_A(_, _, _)), CC_D(CC_E(), CC_B(_, _))) => 5 
  case CC_B(CC_D(_, CC_A(_, _, _)), CC_D(CC_F(_), CC_B(_, _))) => 6 
  case CC_B(CC_D(_, CC_A(_, _, _)), CC_D(CC_D(_, _), CC_C(_, _))) => 7 
  case CC_B(CC_D(_, CC_A(_, _, _)), CC_D(CC_E(), CC_C(_, _))) => 8 
  case CC_B(CC_D(_, CC_A(_, _, _)), CC_D(CC_F(_), CC_C(_, _))) => 9 
  case CC_B(CC_D(_, CC_B(_, _)), CC_D(CC_D(_, _), CC_A(_, _, _))) => 10 
  case CC_B(CC_D(_, CC_B(_, _)), CC_D(CC_E(), CC_A(_, _, _))) => 11 
  case CC_B(CC_D(_, CC_B(_, _)), CC_D(CC_F(_), CC_A(_, _, _))) => 12 
  case CC_B(CC_D(_, CC_B(_, _)), CC_D(CC_D(_, _), CC_B(_, _))) => 13 
  case CC_B(CC_D(_, CC_B(_, _)), CC_D(CC_E(), CC_B(_, _))) => 14 
  case CC_B(CC_D(_, CC_B(_, _)), CC_D(CC_F(_), CC_B(_, _))) => 15 
  case CC_B(CC_D(_, CC_B(_, _)), CC_D(CC_D(_, _), CC_C(_, _))) => 16 
  case CC_B(CC_D(_, CC_B(_, _)), CC_D(CC_E(), CC_C(_, _))) => 17 
  case CC_B(CC_D(_, CC_B(_, _)), CC_D(CC_F(_), CC_C(_, _))) => 18 
  case CC_B(CC_D(_, CC_C(_, _)), CC_D(CC_D(_, _), CC_A(_, _, _))) => 19 
  case CC_B(CC_D(_, CC_C(_, _)), CC_D(CC_E(), CC_A(_, _, _))) => 20 
  case CC_B(CC_D(_, CC_C(_, _)), CC_D(CC_F(_), CC_A(_, _, _))) => 21 
  case CC_B(CC_D(_, CC_C(_, _)), CC_D(CC_D(_, _), CC_B(_, _))) => 22 
  case CC_B(CC_D(_, CC_C(_, _)), CC_D(CC_E(), CC_B(_, _))) => 23 
  case CC_B(CC_D(_, CC_C(_, _)), CC_D(CC_F(_), CC_B(_, _))) => 24 
  case CC_B(CC_D(_, CC_C(_, _)), CC_D(CC_D(_, _), CC_C(_, _))) => 25 
  case CC_B(CC_D(_, CC_C(_, _)), CC_D(CC_E(), CC_C(_, _))) => 26 
  case CC_B(CC_D(_, CC_C(_, _)), CC_D(CC_F(_), CC_C(_, _))) => 27 
  case CC_C(_, _) => 28 
}
}