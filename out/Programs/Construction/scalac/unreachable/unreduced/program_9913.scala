package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_B[D]], b: Boolean, c: D) extends T_A[D, T_B[D]]
case class CC_B[E, F](a: T_A[F, F]) extends T_B[E]
case class CC_C[G](a: T_B[G], b: T_A[G, G]) extends T_B[G]
case class CC_D[H](a: H, b: Int) extends T_B[H]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_C(CC_B(_), _), _) => 1 
  case CC_C(CC_C(CC_C(_, _), _), _) => 2 
  case CC_C(CC_C(CC_D(_, _), _), _) => 3 
  case CC_C(CC_D(_, _), _) => 4 
  case CC_D(_, _) => 5 
}
}
// This is not matched: CC_C(CC_B(_), _)