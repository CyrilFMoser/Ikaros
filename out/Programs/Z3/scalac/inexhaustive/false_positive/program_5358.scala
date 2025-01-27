package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: F) extends T_A[T_A[F, F], F]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard Wildcard (T_A (T_A Byte Byte) Byte))