package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B(a: T_A[(Int,(Byte,Boolean))]) extends T_A[T_A[CC_A[Int]]]
case class CC_C(a: CC_A[Int], b: CC_A[T_A[CC_B]], c: T_A[CC_B]) extends T_A[T_A[CC_A[Int]]]

val v_a: T_A[T_A[CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_A(), CC_A(), _) => 1 
}
}
// This is not matched: CC_B(CC_A())