package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Int, Char], T_B[Boolean, Int]], b: Char, c: T_B[Char, Byte]) extends T_A[T_B[T_A[Byte, Char], T_A[Boolean, Char]], T_B[T_B[Boolean, Boolean], T_B[Byte, Boolean]]]
case class CC_B[E](a: T_A[E, E]) extends T_B[Boolean, E]
case class CC_C[F](a: T_B[Boolean, F]) extends T_B[Boolean, F]
case class CC_D[G](a: T_B[Boolean, G], b: G) extends T_B[Boolean, G]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
  case CC_D(CC_C(_), _) => 2 
  case CC_D(CC_D(_, _), _) => 3 
}
}
// This is not matched: CC_D(CC_B(_), _)