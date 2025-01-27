package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[Int]]]
case class CC_B(a: T_A[CC_A], b: T_A[Char]) extends T_A[T_B[T_A[Int]]]
case class CC_C(a: Byte, b: Boolean, c: T_B[CC_A]) extends T_A[T_B[T_A[Int]]]
case class CC_D[C](a: T_B[C]) extends T_B[C]

val v_a: T_A[T_B[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, true, _) => 1 
  case CC_C(_, false, _) => 2 
}
}
// This is not matched: CC_A()