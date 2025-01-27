package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E], c: T_B[E, E]) extends T_A[(T_B[Boolean, Byte],T_B[Boolean, Int]), E]
case class CC_B() extends T_A[(T_B[Boolean, Byte],T_B[Boolean, Int]), CC_A[T_A[Byte, Int]]]
case class CC_C[F](a: Boolean, b: T_B[F, Byte], c: CC_B) extends T_B[F, Byte]

val v_a: T_A[(T_B[Boolean, Byte],T_B[Boolean, Int]), CC_A[T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}