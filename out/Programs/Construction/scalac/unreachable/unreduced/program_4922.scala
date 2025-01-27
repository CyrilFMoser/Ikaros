package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(Int,T_A[Int])]
case class CC_B(a: T_B[CC_A], b: T_A[Boolean]) extends T_A[(Int,T_A[Int])]
case class CC_C[C](a: Boolean) extends T_B[C]

val v_a: T_A[(Int,T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(true), _) => 1 
  case CC_B(CC_C(false), _) => 2 
}
}