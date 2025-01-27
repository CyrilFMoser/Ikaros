package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Byte, T_A[Byte, Char]], C]
case class CC_B[D](a: (T_A[Boolean, Int],CC_A[Byte])) extends T_A[T_A[Byte, T_A[Byte, Char]], D]

val v_a: T_A[T_A[Byte, T_A[Byte, Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A())) => 1 
}
}