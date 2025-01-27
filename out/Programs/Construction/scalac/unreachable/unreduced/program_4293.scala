package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[(T_A[Int],T_A[(Int,Char)])]
case class CC_B[B](a: T_A[B], b: Int) extends T_A[(T_A[Int],T_A[(Int,Char)])]

val v_a: T_A[(T_A[Int],T_A[(Int,Char)])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}