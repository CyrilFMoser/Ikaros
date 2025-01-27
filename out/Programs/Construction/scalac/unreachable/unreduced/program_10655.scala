package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: CC_A, b: C, c: Byte) extends T_B[Byte, C]
case class CC_C[D, E](a: Boolean) extends T_B[Byte, D]
case class CC_D[F, G](a: T_B[Byte, G], b: T_B[F, F], c: T_B[Byte, G]) extends T_B[Byte, F]

val v_a: T_B[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_C(_)