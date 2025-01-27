package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C) extends T_A[T_A[(Char,Int), (Byte,Boolean)], C]
case class CC_B[E, F](a: T_A[F, F], b: CC_A[E, CC_A[E, F]], c: Boolean) extends T_A[T_A[(Char,Int), (Byte,Boolean)], E]
case class CC_C[G](a: CC_B[G, Char], b: CC_A[G, G]) extends T_A[T_A[(Char,Int), (Byte,Boolean)], G]

val v_a: T_A[T_A[(Char,Int), (Byte,Boolean)], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(CC_B(_, _, _), CC_A(_)) => 1 
}
}
// This is not matched: CC_B(_, _, _)