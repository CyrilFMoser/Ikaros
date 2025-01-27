package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E]) extends T_A[E]
case class CC_C(a: CC_B[T_A[Byte]], b: T_A[Byte]) extends T_A[T_A[T_A[Int]]]
case class CC_D[G, F](a: G) extends T_B[G, F]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}