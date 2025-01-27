package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: Char) extends T_A[F, T_A[F, F]]
case class CC_C() extends T_A[(Int,Boolean), T_A[(Int,Boolean), (Int,Boolean)]]

val v_a: CC_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A Byte (T_A Byte))