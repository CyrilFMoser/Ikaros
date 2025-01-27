package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[D], D]
case class CC_B(a: T_A[Boolean, Byte]) extends T_A[T_B[T_B[T_B[Int]]], T_B[T_B[Int]]]
case class CC_C[E](a: CC_A[E], b: (Byte,T_B[(Char,Char)])) extends T_A[T_B[E], E]
case class CC_D[F](a: T_A[F, F], b: T_A[T_B[F], F], c: Char) extends T_B[F]
case class CC_E[G](a: Boolean) extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_), _) => 0 
  case CC_D(_, CC_C(_, _), _) => 1 
  case CC_E(_) => 2 
}
}