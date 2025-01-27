package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_A[C]) extends T_A[C]
case class CC_B(a: CC_A[T_B[Byte]], b: T_B[Byte], c: T_A[T_A[(Char,Int)]]) extends T_B[(Byte,T_B[Int])]
case class CC_C() extends T_B[(Byte,T_B[Int])]

val v_a: T_B[(Byte,T_B[Int])] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _)) => 0 
  case CC_C() => 1 
}
}