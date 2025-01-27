package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[T_A[T_B[Boolean, Byte], T_A[Byte, Boolean]], E]
case class CC_B[F](a: (CC_A[(Byte,Boolean)],T_A[Byte, Char]), b: CC_A[F], c: CC_A[F]) extends T_A[T_A[T_B[Boolean, Byte], T_A[Byte, Boolean]], F]
case class CC_C[G](a: G) extends T_A[T_A[T_B[Boolean, Byte], T_A[Byte, Boolean]], G]

val v_a: T_A[T_A[T_B[Boolean, Byte], T_A[Byte, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, CC_A(_)) => 1 
  case CC_C(true) => 2 
  case CC_C(false) => 3 
}
}