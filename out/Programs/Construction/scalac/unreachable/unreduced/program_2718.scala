package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_B[(Byte,Char)]]
case class CC_B[C](a: (T_A[CC_A],CC_A), b: (CC_A,Int)) extends T_B[C]
case class CC_C[D]() extends T_B[D]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_A(_),_)) => 0 
  case CC_C() => 1 
}
}