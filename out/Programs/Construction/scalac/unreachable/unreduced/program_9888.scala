package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_A[CC_A], b: T_A[Int]) extends T_A[T_A[T_A[T_B]]]
case class CC_C() extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: Char, b: T_A[CC_A], c: CC_A) extends T_B
case class CC_E(a: T_B, b: CC_D) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()