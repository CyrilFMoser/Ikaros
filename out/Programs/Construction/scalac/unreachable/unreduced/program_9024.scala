package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[D], c: T_A[T_B[D], D]) extends T_A[T_B[D], D]
case class CC_B[E](a: T_A[T_B[E], E], b: T_B[E]) extends T_B[E]
case class CC_C[F](a: T_A[F, (Int,Boolean)], b: Boolean, c: F) extends T_B[F]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, CC_A(_, _, _)), CC_B(_, _)) => 0 
  case CC_B(CC_A(_, _, CC_A(_, _, _)), CC_C(_, _, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}