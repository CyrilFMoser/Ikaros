package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D, E](a: T_A[D, (Int,Int)], b: E) extends T_A[T_A[D, T_A[D, D]], D]
case class CC_C[F](a: F, b: (T_A[Char, Char],((Char,Int),Byte)), c: CC_B[CC_B[F, F], F]) extends T_A[T_A[F, T_A[F, F]], F]

val v_a: T_A[T_A[Boolean, T_A[Boolean, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}