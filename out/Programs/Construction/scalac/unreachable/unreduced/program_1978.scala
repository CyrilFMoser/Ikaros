package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (Int,Int), b: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_B[F, CC_B[F]], b: T_B[F, F]) extends T_B[T_B[Byte, T_B[(Byte,Int), Byte]], F]
case class CC_D(a: T_A[T_A[Byte]], b: T_A[CC_A[Char]], c: CC_C[T_A[Char]]) extends T_B[T_B[Byte, T_B[(Byte,Int), Byte]], T_A[CC_B[Int]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
}
}