package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[T_B],T_A[T_B])) extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[Int]]) extends T_B
case class CC_C() extends T_B
case class CC_D[B]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A((_,_))) => 0 
  case CC_C() => 1 
  case CC_D() => 2 
}
}