package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[D], b: Int) extends T_A[D]
case class CC_C[E](a: T_A[(Byte,(Int,Char))], b: CC_B[E]) extends T_A[E]
case class CC_D(a: T_A[T_A[Boolean]], b: Boolean) extends T_B[CC_B[T_A[Boolean]]]
case class CC_E() extends T_B[CC_B[T_A[Boolean]]]
case class CC_F[F](a: T_A[F], b: F, c: T_A[F]) extends T_B[CC_B[T_A[Boolean]]]

val v_a: T_B[CC_B[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _) => 0 
  case CC_D(CC_B(_, _), _) => 1 
  case CC_D(CC_C(_, _), _) => 2 
  case CC_E() => 3 
  case CC_F(_, _, _) => 4 
}
}