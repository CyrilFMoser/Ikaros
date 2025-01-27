package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_A[Boolean], T_A[Boolean]]]
case class CC_B(a: T_A[(Byte,CC_A)], b: CC_A, c: T_B[Byte, T_A[(Char,Char)]]) extends T_A[T_B[T_A[Boolean], T_A[Boolean]]]
case class CC_C(a: T_B[Char, CC_A], b: CC_A, c: CC_B) extends T_A[T_B[T_A[Boolean], T_A[Boolean]]]
case class CC_D[D]() extends T_B[T_A[T_A[CC_C]], D]
case class CC_E[E]() extends T_B[T_A[T_A[CC_C]], E]
case class CC_F[F](a: T_B[F, F], b: F, c: Int) extends T_B[T_A[T_A[CC_C]], F]

val v_a: T_A[T_B[T_A[Boolean], T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_A(), CC_B(_, _, _)) => 2 
}
}