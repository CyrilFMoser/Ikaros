package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[(T_A[Int],T_A[Int])]
case class CC_B(a: T_A[CC_A[Boolean]], b: T_A[Byte], c: CC_A[CC_A[Char]]) extends T_A[(T_A[Int],T_A[Int])]

val v_a: T_A[(T_A[Int],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}