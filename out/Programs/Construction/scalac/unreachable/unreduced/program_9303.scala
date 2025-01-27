package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[T_A[C, C], C]) extends T_A[(T_A[Char, Byte],T_A[Int, Boolean]), C]
case class CC_B[E]() extends T_A[(T_A[Char, Byte],T_A[Int, Boolean]), E]
case class CC_C[F](a: T_A[F, F], b: Boolean) extends T_A[(T_A[Char, Byte],T_A[Int, Boolean]), F]

val v_a: T_A[(T_A[Char, Byte],T_A[Int, Boolean]), Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_)