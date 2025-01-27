package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_D[F](a: F) extends T_B[(CC_B,CC_A), F]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)