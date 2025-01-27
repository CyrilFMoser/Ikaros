package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Int, T_A[Int, Char]], (((Int,Char),Boolean),T_A[Boolean, Int])]
case class CC_B[C](a: ((Byte,CC_A),T_A[CC_A, CC_A]), b: T_A[C, C], c: T_A[C, C]) extends T_A[CC_A, C]
case class CC_C(a: T_A[T_A[Boolean, CC_A], (CC_A,Byte)]) extends T_A[T_A[Int, T_A[Int, Char]], (((Int,Char),Boolean),T_A[Boolean, Int])]

val v_a: T_A[T_A[Int, T_A[Int, Char]], (((Int,Char),Boolean),T_A[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
}
}