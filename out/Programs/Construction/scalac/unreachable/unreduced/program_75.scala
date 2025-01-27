package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[(Int,Int), T_A[Boolean, Int]]]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, T_A[(Int,Int), T_A[Boolean, Int]]]
case class CC_C() extends T_A[CC_B[Boolean], CC_B[CC_B[Int]]]

val v_a: T_A[CC_C, T_A[(Int,Int), T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}