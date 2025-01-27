package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, (Boolean,T_A[Byte, Char])]
case class CC_B[E](a: Byte, b: Boolean, c: T_A[E, CC_A[E]]) extends T_A[E, (Boolean,T_A[Byte, Char])]
case class CC_C[F](a: T_A[F, F]) extends T_A[F, (Boolean,T_A[Byte, Char])]

val v_a: T_A[Boolean, (Boolean,T_A[Byte, Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_)