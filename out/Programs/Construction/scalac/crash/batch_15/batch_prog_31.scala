package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[Byte],T_B[Boolean]), b: Byte) extends T_A[C]
case class CC_B(a: T_B[T_A[Char]]) extends T_A[T_B[T_B[Byte]]]
case class CC_C[D](a: Boolean) extends T_A[D]
case class CC_D[E]() extends T_B[E]
case class CC_E[F]() extends T_B[F]
case class CC_F[G](a: G) extends T_B[G]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),CC_D()), _) => 0 
  case CC_A((CC_A(_, _),CC_E()), _) => 1 
  case CC_A((CC_A(_, _),CC_F(_)), _) => 2 
  case CC_A((CC_C(_),CC_D()), _) => 3 
  case CC_A((CC_C(_),CC_E()), _) => 4 
  case CC_A((CC_C(_),CC_F(_)), _) => 5 
}
}
// This is not matched: CC_C(_)