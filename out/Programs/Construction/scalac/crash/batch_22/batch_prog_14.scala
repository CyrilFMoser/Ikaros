package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Byte],T_A[Int, Byte]), b: T_A[C, (Int,Byte)], c: T_A[T_A[C, C], C]) extends T_A[C, T_A[T_A[Int, Char], T_A[Int, Boolean]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Int, Char], T_A[Int, Boolean]]]
case class CC_C[F, E](a: E, b: T_A[E, E], c: E) extends T_A[F, E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}