package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_C[F](a: Byte) extends T_A[T_A[(Boolean,Char), Boolean], F]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A T_B)))