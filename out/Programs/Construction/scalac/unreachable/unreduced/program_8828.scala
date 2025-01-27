package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: T_A[T_B[(Int,Int), Boolean]], b: T_B[T_A[Byte], (Boolean,Byte)]) extends T_A[(T_B[Int, Char],T_B[Int, Boolean])]
case class CC_C() extends T_A[(T_B[Int, Char],T_B[Int, Boolean])]
case class CC_D[E](a: T_A[T_A[E]], b: E, c: CC_A[E]) extends T_B[CC_C, E]
case class CC_E[F]() extends T_B[CC_C, F]
case class CC_F[G](a: G, b: T_B[CC_C, G]) extends T_B[CC_C, G]

val v_a: T_A[(T_B[Int, Char],T_B[Int, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C()