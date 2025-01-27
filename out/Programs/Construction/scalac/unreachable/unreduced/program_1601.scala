package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Byte, Int], T_B[Int, Boolean]]) extends T_A[(T_B[Boolean, Byte],T_A[Boolean, (Int,Boolean)]), T_B[T_B[Int, Byte], T_B[Boolean, Boolean]]]
case class CC_B[E](a: T_A[E, T_B[E, E]], b: E, c: T_A[E, E]) extends T_B[E, T_A[E, E]]
case class CC_C[F, G](a: T_B[F, T_A[F, F]], b: CC_B[F], c: CC_A) extends T_B[F, G]
case class CC_D(a: T_B[Char, T_A[Char, Char]], b: Char) extends T_B[((CC_A,CC_A),CC_C[(Boolean,Int), Int]), T_A[((CC_A,CC_A),CC_C[(Boolean,Int), Int]), ((CC_A,CC_A),CC_C[(Boolean,Int), Int])]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _, _), _) => 0 
  case CC_D(CC_C(_, _, _), _) => 1 
}
}