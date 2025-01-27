package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_C[F](a: Char) extends T_A[(Boolean,Int), F]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_C Int (T_A (T_B Int) Int))