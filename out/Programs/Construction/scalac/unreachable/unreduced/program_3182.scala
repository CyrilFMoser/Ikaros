package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[D], b: T_A[E, E], c: T_A[E, E]) extends T_A[D, E]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C(a: CC_A[Byte, CC_A[(Byte,Char), Boolean]], b: CC_A[Boolean, CC_B[Boolean, Byte]]) extends T_B[T_A[T_A[Int, Byte], Boolean]]
case class CC_D(a: Int) extends T_B[T_A[T_A[Int, Byte], Boolean]]
case class CC_E[H](a: T_A[CC_D, H], b: T_A[H, H]) extends T_B[T_A[T_A[Int, Byte], Boolean]]

val v_a: T_A[T_B[T_A[T_A[Int, Byte], Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_B())) => 0 
  case CC_A(_, _, CC_B()) => 1 
  case CC_B() => 2 
}
}
// This is not matched: CC_A(_, _, CC_A(_, _, CC_A(_, _, _)))