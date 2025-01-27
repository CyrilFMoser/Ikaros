package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_B[T_B[Byte]], D]
case class CC_B[E](a: CC_A[E], b: T_A[CC_A[E], (Int,Char)]) extends T_B[E]
case class CC_C[F](a: Char, b: ((Char,(Char,Boolean)),Boolean)) extends T_B[F]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _)) => 0 
  case CC_A(CC_C(_, _)) => 1 
}
}