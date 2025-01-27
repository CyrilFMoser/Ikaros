package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[T_B[T_B[(Char,Char)]]], b: T_A[C]) extends T_A[C]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_A[F], b: Boolean, c: T_B[F]) extends T_B[F]
case class CC_D[G](a: T_A[G], b: T_A[G], c: CC_C[G]) extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
  case CC_C(_, _, CC_D(CC_A(_, _), CC_A(_, _), CC_C(_, _, _))) => 1 
  case CC_C(_, _, CC_D(CC_B(), CC_A(_, _), CC_C(_, _, _))) => 2 
  case CC_C(_, _, CC_D(CC_A(_, _), CC_B(), CC_C(_, _, _))) => 3 
  case CC_C(_, _, CC_D(CC_B(), CC_B(), CC_C(_, _, _))) => 4 
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _)), CC_C(_, _, _)) => 5 
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_B(), CC_A(_, _)), CC_C(_, _, _)) => 6 
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_B()), CC_C(_, _, _)) => 7 
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_B(), CC_B()), CC_C(_, _, _)) => 8 
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), CC_B(), CC_C(_, _, _)) => 9 
  case CC_D(CC_A(CC_A(_, _), CC_B()), CC_A(CC_A(_, _), CC_A(_, _)), CC_C(_, _, _)) => 10 
  case CC_D(CC_A(CC_A(_, _), CC_B()), CC_A(CC_B(), CC_A(_, _)), CC_C(_, _, _)) => 11 
  case CC_D(CC_A(CC_A(_, _), CC_B()), CC_A(CC_A(_, _), CC_B()), CC_C(_, _, _)) => 12 
  case CC_D(CC_A(CC_A(_, _), CC_B()), CC_A(CC_B(), CC_B()), CC_C(_, _, _)) => 13 
  case CC_D(CC_A(CC_A(_, _), CC_B()), CC_B(), CC_C(_, _, _)) => 14 
  case CC_D(CC_A(CC_B(), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _)), CC_C(_, _, _)) => 15 
  case CC_D(CC_A(CC_B(), CC_A(_, _)), CC_A(CC_B(), CC_A(_, _)), CC_C(_, _, _)) => 16 
  case CC_D(CC_A(CC_B(), CC_A(_, _)), CC_A(CC_A(_, _), CC_B()), CC_C(_, _, _)) => 17 
  case CC_D(CC_A(CC_B(), CC_A(_, _)), CC_A(CC_B(), CC_B()), CC_C(_, _, _)) => 18 
  case CC_D(CC_A(CC_B(), CC_A(_, _)), CC_B(), CC_C(_, _, _)) => 19 
  case CC_D(CC_A(CC_B(), CC_B()), CC_A(CC_A(_, _), CC_A(_, _)), CC_C(_, _, _)) => 20 
  case CC_D(CC_A(CC_B(), CC_B()), CC_A(CC_B(), CC_A(_, _)), CC_C(_, _, _)) => 21 
  case CC_D(CC_A(CC_B(), CC_B()), CC_A(CC_A(_, _), CC_B()), CC_C(_, _, _)) => 22 
  case CC_D(CC_A(CC_B(), CC_B()), CC_A(CC_B(), CC_B()), CC_C(_, _, _)) => 23 
  case CC_D(CC_A(CC_B(), CC_B()), CC_B(), CC_C(_, _, _)) => 24 
  case CC_D(CC_B(), CC_A(CC_A(_, _), CC_A(_, _)), CC_C(_, _, _)) => 25 
  case CC_D(CC_B(), CC_A(CC_B(), CC_A(_, _)), CC_C(_, _, _)) => 26 
  case CC_D(CC_B(), CC_A(CC_A(_, _), CC_B()), CC_C(_, _, _)) => 27 
  case CC_D(CC_B(), CC_A(CC_B(), CC_B()), CC_C(_, _, _)) => 28 
  case CC_D(CC_B(), CC_B(), CC_C(_, _, _)) => 29 
}
}