package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Byte],T_A[Boolean, Int]), b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
}
}