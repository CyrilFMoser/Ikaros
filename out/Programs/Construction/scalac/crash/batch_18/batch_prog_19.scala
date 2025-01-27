package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean, b: T_B[D]) extends T_A[T_B[T_B[(Int,Byte)]], D]
case class CC_B() extends T_A[Char, Boolean]
case class CC_C[E](a: (Int,T_B[CC_B]), b: T_A[E, E]) extends T_A[T_B[T_B[(Int,Byte)]], E]
case class CC_D[F]() extends T_B[F]

val v_a: CC_C[T_A[Char, Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}