package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[Int, T_A[Boolean, Byte]]]
case class CC_B[D, E]() extends T_A[D, T_A[Int, T_A[Boolean, Byte]]]
case class CC_C[F](a: Boolean) extends T_A[F, T_A[T_A[Boolean, Byte], T_A[Char, Char]]]

val v_a: T_A[Int, T_A[Int, T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}