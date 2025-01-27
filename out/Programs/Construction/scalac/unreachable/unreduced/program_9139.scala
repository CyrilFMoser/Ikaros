package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, Boolean]) extends T_A[T_A[E, E], E]
case class CC_B(a: T_A[T_A[CC_A[Boolean], CC_A[Boolean]], CC_A[Boolean]], b: Boolean) extends T_A[T_A[T_A[T_A[Byte, Char], (Char,Int)], T_A[T_A[Byte, Char], (Char,Int)]], T_A[T_A[Byte, Char], (Char,Int)]]
case class CC_C[F](a: (T_B[Int, CC_B],T_B[Int, CC_B]), b: T_B[T_A[F, F], F], c: CC_B) extends T_B[T_A[F, F], F]
case class CC_D[G](a: CC_A[G], b: (T_B[CC_B, Boolean],CC_B), c: T_B[T_A[G, G], G]) extends T_B[T_A[G, G], G]

val v_a: T_A[T_A[T_A[T_A[Byte, Char], (Char,Int)], T_A[T_A[Byte, Char], (Char,Int)]], T_A[T_A[Byte, Char], (Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}