package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[(T_A[Char],T_A[(Int,Byte)])]
case class CC_B() extends T_A[(T_A[Char],T_A[(Int,Byte)])]
case class CC_C(a: T_A[CC_B], b: CC_B, c: T_A[CC_A]) extends T_A[CC_B]

val v_a: T_A[(T_A[Char],T_A[(Int,Byte)])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}