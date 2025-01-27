package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Byte, E]
case class CC_B[F](a: F, b: CC_A[F]) extends T_B[F, Byte]
case class CC_C[G](a: (T_B[Boolean, Byte],T_A[Boolean, Char]), b: G, c: T_A[G, G]) extends T_B[G, Byte]
case class CC_D[H](a: CC_C[T_B[H, Byte]], b: T_B[H, Byte]) extends T_B[H, Byte]

val v_a: T_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B('x', CC_A()) => 0 
  case CC_C((CC_B(_, _),_), _, _) => 1 
  case CC_C((CC_C(_, _, _),_), _, _) => 2 
  case CC_C((CC_D(_, _),_), _, _) => 3 
  case CC_D(_, _) => 4 
}
}
// This is not matched: CC_B(_, CC_A())