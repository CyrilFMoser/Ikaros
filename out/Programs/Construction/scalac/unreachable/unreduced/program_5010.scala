package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Byte]
case class CC_B(a: CC_A, b: T_A[CC_A], c: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: T_B[T_A[CC_A]], b: T_A[(CC_B,CC_B)], c: CC_A) extends T_A[Byte]
case class CC_D[C, D](a: CC_B, b: CC_A) extends T_B[C]
case class CC_E[E](a: CC_A, b: T_B[E], c: T_A[Byte]) extends T_B[E]
case class CC_F[F, G](a: T_A[Byte], b: CC_A) extends T_B[F]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A()) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(CC_A(), CC_A()) => 2 
  case CC_F(CC_B(CC_A(), _, _), CC_A()) => 3 
  case CC_F(CC_C(CC_D(_, _), _, CC_A()), CC_A()) => 4 
  case CC_F(CC_C(CC_E(_, _, _), _, CC_A()), CC_A()) => 5 
  case CC_F(CC_C(CC_F(_, _), _, CC_A()), CC_A()) => 6 
}
}