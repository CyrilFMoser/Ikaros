package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, E]]
case class CC_B[F](a: CC_A[T_B[F, F]], b: CC_A[CC_A[F]], c: T_A[F, F]) extends T_A[F, T_A[F, F]]
case class CC_C[G](a: (T_B[Int, Int],Boolean), b: CC_A[G], c: G) extends T_B[T_A[G, T_A[G, G]], G]
case class CC_D(a: (Int,Boolean), b: CC_B[Char], c: T_A[Char, T_A[Char, Byte]]) extends T_B[T_A[CC_B[(Byte,(Byte,Char))], T_A[CC_B[(Byte,(Byte,Char))], CC_B[(Byte,(Byte,Char))]]], CC_B[(Byte,(Byte,Char))]]
case class CC_E[H](a: T_A[Int, T_A[Int, Int]], b: Int) extends T_B[T_A[H, T_A[H, H]], H]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}