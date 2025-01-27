package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]]) extends T_A[T_A[(Byte,Int)]]
case class CC_B(a: (T_A[Boolean],CC_A)) extends T_A[Char]
case class CC_C() extends T_A[Char]
case class CC_D[C]() extends T_B[C]
case class CC_E[D](a: CC_D[D], b: T_B[D]) extends T_B[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A(_))) => 0 
  case CC_C() => 1 
}
}