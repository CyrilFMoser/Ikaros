package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]], b: (T_B[Boolean],T_B[Char]), c: Char) extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: T_B[(CC_A,CC_A)], b: (T_A[CC_A],CC_A), c: CC_A) extends T_A[T_B[T_A[Boolean]]]
case class CC_C[C]() extends T_B[C]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}