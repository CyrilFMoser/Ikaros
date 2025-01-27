package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Byte, Int]]) extends T_A[T_B[T_B[Int, Boolean], T_A[Boolean]]]
case class CC_B() extends T_A[T_B[T_B[Int, Boolean], T_A[Boolean]]]
case class CC_C[D](a: D) extends T_B[D, T_A[D]]
case class CC_D[E](a: T_B[E, T_A[E]], b: E, c: T_B[E, CC_B]) extends T_B[E, T_A[E]]
case class CC_E[F, G](a: T_B[F, CC_C[F]], b: Boolean, c: CC_C[F]) extends T_B[F, CC_C[F]]

val v_a: T_A[T_B[T_B[Int, Boolean], T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}