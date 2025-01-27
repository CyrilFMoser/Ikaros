package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Char]], b: T_A[T_B[Char, Char]]) extends T_A[T_B[T_A[Int], T_A[Char]]]
case class CC_B[D](a: T_A[D], b: T_B[D, D]) extends T_A[T_B[T_A[Int], T_A[Char]]]
case class CC_C(a: CC_B[Int], b: T_A[T_A[CC_A]]) extends T_B[T_A[CC_B[(Int,Byte)]], Boolean]
case class CC_D[E](a: T_A[E], b: E) extends T_B[T_A[CC_B[(Int,Byte)]], Boolean]
case class CC_E[F, G](a: Int) extends T_B[F, G]

val v_a: T_B[T_A[CC_B[(Int,Byte)]], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), _) => 0 
  case CC_D(_, _) => 1 
  case CC_E(_) => 2 
}
}