package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Char, Char], (Boolean,Char)], b: T_A[T_B[Char, Int], T_A[Byte, Byte]]) extends T_A[T_B[T_A[Boolean, Char], T_A[Int, (Char,Byte)]], (T_A[Boolean, Char],T_B[(Int,Boolean), Boolean])]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_B[T_A[Boolean, Char], T_A[Int, (Char,Byte)]], (T_A[Boolean, Char],T_B[(Int,Boolean), Boolean])]
case class CC_C[E]() extends T_A[CC_B, E]
case class CC_D[F](a: CC_B) extends T_B[F, T_B[F, F]]
case class CC_E[G](a: G, b: G) extends T_B[Int, G]
case class CC_F(a: Byte, b: T_B[Int, CC_D[CC_B]], c: T_A[CC_B, (CC_B,Char)]) extends T_B[T_B[Int, CC_C[CC_B]], T_B[T_B[Int, CC_C[CC_B]], T_B[Int, CC_C[CC_B]]]]

val v_a: T_A[T_B[T_A[Boolean, Char], T_A[Int, (Char,Byte)]], (T_A[Boolean, Char],T_B[(Int,Boolean), Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}