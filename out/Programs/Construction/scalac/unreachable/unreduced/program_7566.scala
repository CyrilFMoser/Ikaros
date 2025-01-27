package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[D]]
case class CC_B[E](a: (T_B[Byte],T_B[Byte]), b: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: Int, b: CC_B[F], c: CC_A[F]) extends T_B[F]
case class CC_D[G]() extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_, _),CC_B(_, _)), _) => 0 
  case CC_B((CC_B(_, _),CC_C(_, _, _)), _) => 1 
  case CC_B((CC_B(_, _),CC_D()), _) => 2 
  case CC_B((CC_C(_, _, _),CC_B(_, _)), _) => 3 
  case CC_B((CC_C(_, _, _),CC_D()), _) => 4 
  case CC_B((CC_D(),CC_B(_, _)), _) => 5 
  case CC_B((CC_D(),CC_C(_, _, _)), _) => 6 
  case CC_B((CC_D(),CC_D()), _) => 7 
  case CC_C(_, _, CC_A()) => 8 
  case CC_D() => 9 
}
}
// This is not matched: CC_B((CC_C(_, _, _),CC_C(_, _, _)), _)