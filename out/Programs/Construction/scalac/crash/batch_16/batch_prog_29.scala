package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[T_A[D, (Char,Char)], D], b: T_A[D, D]) extends T_A[D, E]
case class CC_B[F]() extends T_B[F]
case class CC_C[G](a: T_A[T_B[G], G], b: T_B[G]) extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B()) => 1 
  case CC_C(_, CC_C(CC_A(_, _), CC_B())) => 2 
  case CC_C(_, CC_C(CC_A(_, _), CC_C(_, _))) => 3 
}
}