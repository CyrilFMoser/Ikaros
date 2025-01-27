package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: E, b: T_B[E, E], c: E) extends T_A[E]
case class CC_C[F](a: T_B[F, F], b: T_A[F]) extends T_A[F]
case class CC_D[G]() extends T_B[T_A[(Byte,Char)], G]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_A()) => 2 
  case CC_C(_, CC_B(_, _, _)) => 3 
  case CC_C(_, CC_C(_, CC_B(_, _, _))) => 4 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 5 
}
}
// This is not matched: CC_C(_, CC_C(_, CC_A()))