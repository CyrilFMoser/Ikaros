package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[D], b: T_B[E]) extends T_A[E, D]
case class CC_B[F, G](a: T_A[G, G]) extends T_A[F, G]
case class CC_C(a: T_A[CC_A[Byte, (Byte,Byte)], T_A[Char, Boolean]]) extends T_B[Int]
case class CC_D(a: T_B[Int], b: T_A[Char, Char], c: T_B[(Char,Int)]) extends T_B[Int]

val v_a: T_A[CC_D, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _))