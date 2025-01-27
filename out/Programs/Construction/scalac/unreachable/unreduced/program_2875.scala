package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[(Char,Char)]], b: T_A[(Char,Int)]) extends T_A[T_B[T_A[Byte], T_A[Boolean]]]
case class CC_B() extends T_A[T_B[T_A[Byte], T_A[Boolean]]]
case class CC_C() extends T_A[T_B[T_A[Byte], T_A[Boolean]]]
case class CC_D[D, E](a: CC_A, b: E) extends T_B[E, D]
case class CC_E[F](a: CC_C, b: Int) extends T_B[F, T_A[F]]

val v_a: T_A[T_B[T_A[Byte], T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}