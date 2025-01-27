package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: E, b: Byte, c: E) extends T_A[E]
case class CC_C[F](a: T_A[F], b: F, c: T_A[F]) extends T_A[F]
case class CC_D[G](a: T_A[G]) extends T_B[G, T_B[G, G]]
case class CC_E(a: Int, b: (CC_B[Boolean],(Boolean,(Char,Boolean))), c: CC_D[(Int,Int)]) extends T_B[CC_B[Char], T_B[CC_B[Char], CC_B[Char]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, _, _) => 3 
}
}