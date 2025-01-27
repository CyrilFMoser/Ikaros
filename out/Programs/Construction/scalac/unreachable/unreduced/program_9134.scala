package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_B[T_B[Boolean]]) extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_B[T_A[Boolean]]]
case class CC_C[C]() extends T_B[C]
case class CC_D[D]() extends T_B[T_B[Char]]
case class CC_E(a: ((CC_A,CC_A),T_A[CC_A])) extends T_B[T_B[Char]]

val v_a: T_B[T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
  case CC_E(((_,_),_)) => 2 
}
}