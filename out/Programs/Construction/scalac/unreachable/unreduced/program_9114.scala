package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, E]) extends T_A[E, F]
case class CC_B[G, H](a: T_A[G, G], b: Boolean) extends T_A[G, H]
case class CC_C[I](a: Int) extends T_B[I, T_B[T_B[Boolean, Boolean], (Char,Byte)]]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_B(_, _), _) => 1 
}
}
// This is not matched: CC_B(CC_A(_), _)