package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[D], b: Byte) extends T_A[(T_A[Int],T_B[Byte])]
case class CC_C(a: Boolean) extends T_A[(T_A[Int],T_B[Byte])]
case class CC_D[E](a: E, b: T_A[E], c: T_A[E]) extends T_B[E]
case class CC_E[F](a: CC_B[F], b: Byte, c: T_B[F]) extends T_B[F]
case class CC_F[G](a: CC_E[G], b: T_B[G]) extends T_B[G]

val v_a: CC_F[T_A[(T_A[Int],T_B[Byte])]] = null
val v_b: Int = v_a match{
  case CC_F(_, CC_D(CC_A(), CC_A(), _)) => 0 
  case CC_F(_, CC_D(CC_C(_), CC_A(), _)) => 1 
  case CC_F(_, CC_E(CC_B(_, _), _, CC_D(_, _, _))) => 2 
  case CC_F(_, CC_E(CC_B(_, _), _, CC_E(_, _, _))) => 3 
  case CC_F(_, CC_E(CC_B(_, _), _, CC_F(_, _))) => 4 
  case CC_F(_, CC_F(CC_E(_, _, _), CC_D(_, _, _))) => 5 
  case CC_F(_, CC_F(CC_E(_, _, _), CC_E(_, _, _))) => 6 
  case CC_F(_, CC_F(CC_E(_, _, _), CC_F(_, _))) => 7 
}
}
// This is not matched: CC_F(_, CC_D(CC_B(_, _), CC_A(), _))