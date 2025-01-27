package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[Boolean, T_B]
case class CC_B(a: T_A[Boolean, T_B], b: T_A[(Int,Char), Int], c: T_A[T_A[Boolean, T_B], Boolean]) extends T_B
case class CC_C(a: (T_A[Boolean, T_B],T_A[Boolean, T_B])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, _) => 0 
  case CC_C((CC_A(),CC_A())) => 1 
}
}