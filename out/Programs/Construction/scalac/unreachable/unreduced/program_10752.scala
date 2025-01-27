package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[Int]]]
case class CC_B(a: T_A[Int]) extends T_A[T_B[T_B[Int]]]
case class CC_C() extends T_A[T_B[T_B[Int]]]
case class CC_D(a: Int, b: (CC_B,CC_B)) extends T_B[CC_A]

val v_a: T_A[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}