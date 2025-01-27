package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[E]) extends T_A[D, E]
case class CC_B[G, F, H](a: T_A[F, F], b: H, c: Boolean) extends T_A[G, F]
case class CC_C(a: T_B[Int], b: Byte) extends T_B[Int]
case class CC_D(a: Byte) extends T_B[Int]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_B(CC_A(_), _, _), _, _) => 1 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 2 
}
}
// This is not matched: CC_B(CC_A(_), _, _)