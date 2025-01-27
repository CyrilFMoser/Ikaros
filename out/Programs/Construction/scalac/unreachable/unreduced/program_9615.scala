package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean, b: Boolean, c: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_B[E], b: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: (T_B[Boolean],T_B[(Boolean,Boolean)]), b: T_A[F, T_B[F]]) extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), _) => 0 
  case CC_B(CC_B(CC_C(_, _), _), _) => 1 
  case CC_C(_, CC_A(_, _, _)) => 2 
}
}
// This is not matched: CC_B(CC_C(_, CC_A(_, _, _)), _)