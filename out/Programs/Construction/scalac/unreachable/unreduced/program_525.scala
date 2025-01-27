package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_A[Byte], T_B[Byte, Byte]]]
case class CC_B[E, D](a: T_B[E, D], b: T_B[D, E]) extends T_B[D, E]
case class CC_C[F, G](a: T_B[F, G], b: T_A[G]) extends T_B[F, G]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), CC_B(_, _)) => 0 
  case CC_B(CC_C(_, _), CC_B(_, _)) => 1 
  case CC_B(CC_C(_, _), CC_C(_, _)) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_B(CC_B(_, _), CC_C(_, _))