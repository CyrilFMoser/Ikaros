package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, (T_A[Boolean, Int],T_A[Byte, Boolean])]
case class CC_B[E](a: T_A[E, E], b: CC_A[E]) extends T_A[E, (T_A[Boolean, Int],T_A[Byte, Boolean])]
case class CC_C[F](a: T_B[F], b: (CC_A[Char],T_A[Boolean, Char])) extends T_A[F, (T_A[Boolean, Int],T_A[Byte, Boolean])]
case class CC_D[G]() extends T_B[G]

val v_a: T_A[Boolean, (T_A[Boolean, Int],T_A[Byte, Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_)