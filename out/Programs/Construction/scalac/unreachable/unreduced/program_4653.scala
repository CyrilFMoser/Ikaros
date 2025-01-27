package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_B[E, Char]], b: Char) extends T_A[T_A[E, E], E]
case class CC_B[F](a: T_B[T_A[F, F], F], b: F) extends T_B[T_B[CC_A[Int], CC_A[Char]], F]
case class CC_C[G](a: T_A[T_A[G, G], G]) extends T_B[T_B[CC_A[Int], CC_A[Char]], G]
case class CC_D(a: CC_C[Byte], b: CC_C[Int], c: (T_B[(Char,Byte), Int],CC_A[(Char,Byte)])) extends T_B[T_B[CC_A[Int], CC_A[Char]], CC_A[Boolean]]

val v_a: T_B[T_B[CC_A[Int], CC_A[Char]], CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, 'x')) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_D(_, _, _)