package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[E, T_A[T_A[Byte, Byte], Boolean]]
case class CC_B[F](a: T_B[Boolean, T_A[Boolean, Boolean]], b: T_B[F, T_A[F, F]], c: CC_A[F]) extends T_B[F, T_A[F, F]]
case class CC_C[G](a: ((Char,Int),CC_A[Char]), b: CC_A[T_B[G, G]]) extends T_B[G, T_A[G, G]]
case class CC_D(a: T_B[CC_B[Boolean], T_A[CC_B[Boolean], CC_B[Boolean]]]) extends T_B[CC_A[Byte], T_A[CC_A[Byte], CC_A[Byte]]]

val v_a: T_B[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, CC_A(_)) => 0 
  case CC_B(CC_C(_, _), _, CC_A(_)) => 1 
  case CC_C(_, CC_A(_)) => 2 
}
}