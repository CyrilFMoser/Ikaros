package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[C, C], C]
case class CC_B[E, F]() extends T_A[E, F]

val v_a: CC_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}