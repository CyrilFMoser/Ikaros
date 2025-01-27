package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: (T_A[T_B, T_B],T_A[(Char,Boolean), T_B]), b: T_A[D, T_A[T_B, D]], c: T_A[C, C]) extends T_A[C, D]
case class CC_B[E](a: CC_A[E, E]) extends T_A[Byte, E]
case class CC_C(a: T_A[T_A[T_B, T_B], T_A[T_B, T_B]], b: T_A[T_A[T_B, (Boolean,Char)], T_A[T_B, Byte]], c: Boolean) extends T_B
case class CC_D[F](a: T_B, b: T_B, c: CC_B[F]) extends T_B

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_A((_,_), CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), _)) => 0 
}
}