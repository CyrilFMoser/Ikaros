package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_A[T_B[E], T_B[T_B[E]]], b: T_A[E, E], c: T_B[E]) extends T_A[E, T_B[E]]
case class CC_C[F](a: F, b: F) extends T_A[F, T_B[F]]
case class CC_D[G](a: T_B[G], b: G) extends T_B[G]
case class CC_E(a: Int, b: T_B[CC_C[Byte]]) extends T_B[(T_B[Int],Byte)]
case class CC_F() extends T_B[(T_B[Int],Byte)]

val v_a: T_A[CC_F, T_B[CC_F]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _, CC_D(CC_D(_, _), CC_F())) => 1 
  case CC_B(CC_C(_, CC_D(_, _)), _, CC_D(CC_D(_, _), CC_F())) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_B(CC_B(_, _, _), _, CC_D(CC_D(_, _), CC_F()))