package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C, c: Boolean) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (T_A[Boolean, Boolean],Byte), b: D, c: T_A[T_A[CC_A[Boolean], CC_A[Boolean]], T_A[T_A[CC_A[Boolean], CC_A[Boolean]], T_A[CC_A[Boolean], CC_A[Boolean]]]]) extends T_A[D, T_A[D, D]]
case class CC_C[F]() extends T_A[F, T_A[F, F]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, true) => 0 
  case CC_A(_, _, false) => 1 
  case CC_B(_, _, CC_A(_, _, _)) => 2 
  case CC_B(_, _, CC_B(_, _, _)) => 3 
  case CC_B(_, _, CC_C()) => 4 
}
}
// This is not matched: CC_C()