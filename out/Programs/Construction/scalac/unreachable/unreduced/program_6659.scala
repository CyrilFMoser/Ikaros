package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(T_A[Boolean, Boolean],T_A[Char, Char]), C]
case class CC_B[D](a: T_A[D, D]) extends T_A[(T_A[Boolean, Boolean],T_A[Char, Char]), D]

val v_a: T_A[(T_A[Boolean, Boolean],T_A[Char, Char]), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}