package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: (T_B[Int, Char],Int), b: T_A[T_B[Char, Char], T_A[Byte, Int]], c: Char) extends T_A[T_B[T_B[Boolean, Byte], T_A[(Int,Boolean), Boolean]], T_B[T_A[(Boolean,Boolean), Int], T_A[Int, Byte]]]
case class CC_B[E](a: T_A[E, E], b: E) extends T_A[E, T_B[Int, E]]
case class CC_C[F]() extends T_A[F, T_B[T_B[Int, CC_A], CC_B[(Int,Boolean)]]]
case class CC_D[G, H](a: (T_B[(Char,Int), CC_A],CC_C[CC_A])) extends T_B[H, G]
case class CC_E[I](a: CC_B[I], b: I) extends T_B[I, CC_D[T_B[Byte, CC_A], Char]]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
}
}