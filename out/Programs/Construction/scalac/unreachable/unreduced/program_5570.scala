package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, F], b: T_A[E, F]) extends T_A[E, F]
case class CC_B[G](a: T_B[Int, G], b: T_B[G, G], c: T_B[G, G]) extends T_B[Int, G]
case class CC_C(a: T_A[CC_B[Char], T_A[Boolean, Int]], b: CC_A[T_A[Char, Boolean], Byte]) extends T_B[Int, Boolean]
case class CC_D[H](a: T_A[H, CC_A[H, H]], b: Byte) extends T_B[Int, H]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, _) => 0 
  case CC_B(CC_D(CC_A(_, _), _), _, _) => 1 
  case CC_D(_, _) => 2 
}
}