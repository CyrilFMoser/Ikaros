package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E]() extends T_B[E, T_A[T_A[Byte]]]

val v_a: T_B[Char, T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}