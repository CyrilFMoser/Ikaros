package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean, b: T_A[T_B[(Byte,Int)]], c: T_A[T_A[Boolean]]) extends T_A[Byte]
case class CC_B[C](a: (CC_A,Boolean)) extends T_B[C]
case class CC_C[D]() extends T_B[D]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _, _),_)) => 0 
  case CC_C() => 1 
}
}