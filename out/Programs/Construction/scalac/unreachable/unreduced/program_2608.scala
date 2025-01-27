package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Byte, Char], T_A[Int]]) extends T_A[T_A[((Byte,Boolean),Char)]]
case class CC_B[D](a: T_B[D, D], b: CC_A, c: T_A[D]) extends T_A[T_A[((Byte,Boolean),Char)]]
case class CC_C() extends T_A[T_A[((Byte,Boolean),Char)]]
case class CC_D[E]() extends T_B[E, CC_A]
case class CC_E[F](a: Int) extends T_B[T_B[F, F], F]
case class CC_F[G](a: T_A[G], b: CC_A) extends T_B[G, CC_A]

val v_a: T_A[T_A[((Byte,Boolean),Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_C() => 2 
}
}