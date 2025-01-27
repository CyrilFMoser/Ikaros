package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, T_B[T_B[Byte]]]
case class CC_B[E](a: T_A[E, T_B[E]], b: CC_A[E], c: (Char,T_A[Byte, Boolean])) extends T_B[E]
case class CC_C[F](a: T_B[F], b: CC_A[F]) extends T_B[F]
case class CC_D[G](a: (T_B[Char],T_B[Byte]), b: CC_C[G]) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), (_,_)) => 0 
  case CC_C(_, _) => 1 
  case CC_D((CC_B(_, _, _),CC_B(_, _, _)), CC_C(CC_B(_, _, _), CC_A(_, _))) => 2 
  case CC_D((CC_B(_, _, _),CC_C(_, _)), CC_C(CC_B(_, _, _), CC_A(_, _))) => 3 
  case CC_D((CC_B(_, _, _),CC_D(_, _)), CC_C(CC_B(_, _, _), CC_A(_, _))) => 4 
  case CC_D((CC_C(_, _),CC_B(_, _, _)), CC_C(CC_B(_, _, _), CC_A(_, _))) => 5 
  case CC_D((CC_C(_, _),CC_C(_, _)), CC_C(CC_B(_, _, _), CC_A(_, _))) => 6 
  case CC_D((CC_C(_, _),CC_D(_, _)), CC_C(CC_B(_, _, _), CC_A(_, _))) => 7 
  case CC_D((CC_D(_, _),CC_B(_, _, _)), CC_C(CC_B(_, _, _), CC_A(_, _))) => 8 
  case CC_D((CC_D(_, _),CC_C(_, _)), CC_C(CC_B(_, _, _), CC_A(_, _))) => 9 
  case CC_D((CC_D(_, _),CC_D(_, _)), CC_C(CC_B(_, _, _), CC_A(_, _))) => 10 
  case CC_D((CC_B(_, _, _),CC_B(_, _, _)), CC_C(CC_C(_, _), CC_A(_, _))) => 11 
  case CC_D((CC_B(_, _, _),CC_C(_, _)), CC_C(CC_C(_, _), CC_A(_, _))) => 12 
  case CC_D((CC_B(_, _, _),CC_D(_, _)), CC_C(CC_C(_, _), CC_A(_, _))) => 13 
  case CC_D((CC_C(_, _),CC_B(_, _, _)), CC_C(CC_C(_, _), CC_A(_, _))) => 14 
  case CC_D((CC_C(_, _),CC_C(_, _)), CC_C(CC_C(_, _), CC_A(_, _))) => 15 
  case CC_D((CC_C(_, _),CC_D(_, _)), CC_C(CC_C(_, _), CC_A(_, _))) => 16 
  case CC_D((CC_D(_, _),CC_B(_, _, _)), CC_C(CC_C(_, _), CC_A(_, _))) => 17 
  case CC_D((CC_D(_, _),CC_C(_, _)), CC_C(CC_C(_, _), CC_A(_, _))) => 18 
  case CC_D((CC_D(_, _),CC_D(_, _)), CC_C(CC_C(_, _), CC_A(_, _))) => 19 
  case CC_D((CC_B(_, _, _),CC_B(_, _, _)), CC_C(CC_D(_, _), CC_A(_, _))) => 20 
  case CC_D((CC_B(_, _, _),CC_C(_, _)), CC_C(CC_D(_, _), CC_A(_, _))) => 21 
  case CC_D((CC_B(_, _, _),CC_D(_, _)), CC_C(CC_D(_, _), CC_A(_, _))) => 22 
  case CC_D((CC_C(_, _),CC_B(_, _, _)), CC_C(CC_D(_, _), CC_A(_, _))) => 23 
  case CC_D((CC_C(_, _),CC_C(_, _)), CC_C(CC_D(_, _), CC_A(_, _))) => 24 
  case CC_D((CC_C(_, _),CC_D(_, _)), CC_C(CC_D(_, _), CC_A(_, _))) => 25 
  case CC_D((CC_D(_, _),CC_B(_, _, _)), CC_C(CC_D(_, _), CC_A(_, _))) => 26 
  case CC_D((CC_D(_, _),CC_C(_, _)), CC_C(CC_D(_, _), CC_A(_, _))) => 27 
  case CC_D((CC_D(_, _),CC_D(_, _)), CC_C(CC_D(_, _), CC_A(_, _))) => 28 
}
}