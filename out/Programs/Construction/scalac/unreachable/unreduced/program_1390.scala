package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte, b: Char) extends T_A[T_A[T_A[Boolean, Int], T_A[Byte, Boolean]], C]
case class CC_B[E]() extends T_A[T_A[T_A[Boolean, Int], T_A[Byte, Boolean]], E]
case class CC_C[F](a: CC_A[F, CC_A[F, F]], b: T_A[F, F]) extends T_A[T_A[T_A[Boolean, Int], T_A[Byte, Boolean]], F]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Byte, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _), _) => 2 
}
}