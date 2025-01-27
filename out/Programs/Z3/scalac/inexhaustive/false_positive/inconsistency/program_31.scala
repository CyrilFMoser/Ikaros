package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[Boolean]]
case class CC_C[D](a: T_B[D, D], b: Char) extends T_A[D]
case class CC_D[E]() extends T_B[E, (Int,CC_A)]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, 'x') => 0 
}
}
// This is not matched: (CC_A Byte (T_A Byte))