package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[T_B[Int]], D]
case class CC_B(a: T_B[(Int,Boolean)], b: CC_A[CC_A[Int]], c: T_B[CC_A[Boolean]]) extends T_A[T_B[T_B[Int]], T_B[(Boolean,Int)]]
case class CC_C(a: T_A[CC_A[CC_B], T_A[Char, (Byte,Int)]], b: CC_A[CC_B], c: Byte) extends T_A[T_B[T_B[Int]], T_B[(Boolean,Int)]]
case class CC_D[E](a: E) extends T_B[E]
case class CC_E[F](a: T_A[F, F]) extends T_B[T_B[T_B[CC_B]]]
case class CC_F(a: ((Byte,(Char,Char)),CC_E[CC_C]), b: CC_A[CC_C]) extends T_B[T_B[T_B[CC_B]]]

val v_a: T_A[T_B[T_B[Int]], T_B[(Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(CC_D((_,_)), CC_A(), CC_D(_))