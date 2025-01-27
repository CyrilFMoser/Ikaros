package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Byte], b: T_A[T_A[Byte]]) extends T_A[T_A[(Int,(Int,Boolean))]]
case class CC_B[C](a: (T_B[CC_A],Char), b: C) extends T_A[T_A[(Int,(Int,Boolean))]]
case class CC_C[D]() extends T_B[D]

val v_a: T_A[T_A[(Int,(Int,Boolean))]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
  case CC_B((CC_C(),_), _) => 1 
}
}