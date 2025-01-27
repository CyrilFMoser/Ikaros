package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B[F](a: T_B[T_B[Byte]], b: T_A[T_A[F, F], F]) extends T_A[T_A[F, F], F]
case class CC_C[H, G](a: CC_B[T_A[H, G]], b: CC_B[CC_A[G, H]], c: CC_B[G]) extends T_A[H, G]
case class CC_D(a: CC_A[T_B[Boolean], T_A[Boolean, Char]], b: Boolean) extends T_B[T_B[T_A[Byte, Byte]]]
case class CC_E(a: T_A[Char, Int]) extends T_B[T_B[T_A[Byte, Byte]]]
case class CC_F[I](a: I) extends T_B[T_B[T_A[Byte, Byte]]]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, CC_A())) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_C(_, _, _))) => 4 
  case CC_B(_, CC_C(CC_B(_, _), _, _)) => 5 
  case CC_C(_, _, CC_B(_, CC_A())) => 6 
  case CC_C(_, _, CC_B(_, CC_B(_, _))) => 7 
  case CC_C(_, _, CC_B(_, CC_C(_, _, _))) => 8 
}
}