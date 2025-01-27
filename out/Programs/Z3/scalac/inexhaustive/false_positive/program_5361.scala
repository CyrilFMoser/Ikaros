package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_C[F](a: F) extends T_A[T_A[Int, (Char,Char)], F]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard Wildcard (T_A (T_A Byte Byte) Byte))