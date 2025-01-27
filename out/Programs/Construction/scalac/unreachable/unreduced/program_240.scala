package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean, b: T_A[D, D], c: T_A[D, D]) extends T_A[T_A[T_B[Boolean], T_A[Char, Boolean]], D]
case class CC_B[E](a: T_B[E], b: E, c: (CC_A[Char],T_B[Byte])) extends T_A[T_A[T_B[Boolean], T_A[Char, Boolean]], E]
case class CC_C(a: (CC_A[Byte],T_B[Int])) extends T_A[CC_B[T_B[(Int,Char)]], T_B[T_A[Boolean, Int]]]
case class CC_D[F](a: T_A[F, F], b: F) extends T_B[F]
case class CC_E[G](a: CC_C) extends T_B[G]
case class CC_F(a: CC_A[((Char,Boolean),(Char,Boolean))]) extends T_B[T_B[CC_E[CC_C]]]

val v_a: T_A[T_A[T_B[Boolean], T_A[Char, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}