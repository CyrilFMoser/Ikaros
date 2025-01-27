package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: Boolean) extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_B[E, Boolean]
case class CC_C[F, G](a: Int, b: T_B[G, Boolean]) extends T_B[F, Boolean]

val v_a: CC_C[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_)) => 0 
  case CC_C(_, CC_C(_, _)) => 1 
}
}