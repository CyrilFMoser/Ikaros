package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[T_B[D]], D]
case class CC_B() extends T_B[T_A[T_B[Int], Int]]
case class CC_C() extends T_B[CC_A[T_A[Int, CC_B]]]
case class CC_D(a: T_B[CC_C], b: T_A[(CC_B,CC_C), T_A[CC_C, Byte]], c: T_A[CC_C, CC_C]) extends T_B[CC_A[T_A[Int, CC_B]]]

val v_a: T_B[CC_A[T_A[Int, CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}