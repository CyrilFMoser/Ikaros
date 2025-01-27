package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char, b: Byte) extends T_A[T_A[T_B[Boolean, Int]]]
case class CC_B(a: Boolean, b: CC_A, c: CC_A) extends T_A[T_A[T_B[Boolean, Int]]]
case class CC_C[D, E](a: T_A[E], b: Char, c: T_B[E, CC_A]) extends T_B[E, D]
case class CC_D[F]() extends T_B[CC_A, F]

val v_a: T_B[CC_A, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
  case CC_C(_, _, CC_D()) => 1 
  case CC_D() => 2 
}
}