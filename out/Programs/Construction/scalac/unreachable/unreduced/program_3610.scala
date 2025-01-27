package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char, b: T_B[D]) extends T_A[T_A[(Int,(Int,Boolean)), T_A[Char, Byte]], D]
case class CC_B[E](a: T_B[E], b: Byte, c: (T_A[Boolean, Int],T_A[Byte, Int])) extends T_A[T_A[(Int,(Int,Boolean)), T_A[Char, Byte]], E]
case class CC_C(a: (Int,Boolean), b: T_A[T_A[Boolean, Byte], T_A[Boolean, Boolean]], c: T_A[CC_A[Byte], T_A[Char, Boolean]]) extends T_A[T_A[(Int,(Int,Boolean)), T_A[Char, Byte]], ((Byte,Char),Byte)]
case class CC_D() extends T_B[(CC_B[CC_C],T_B[CC_C])]
case class CC_E[F](a: Char, b: (Boolean,T_B[CC_C]), c: CC_C) extends T_B[F]

val v_a: T_A[T_A[(Int,(Int,Boolean)), T_A[Char, Byte]], CC_D] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_B(CC_E(_, _, CC_C(_, _, _)), _, (_,_)) => 1 
}
}
// This is not matched: CC_A(_, _)