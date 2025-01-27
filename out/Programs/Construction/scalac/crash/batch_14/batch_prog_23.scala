package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B(a: CC_A[T_A[T_B]], b: CC_A[T_A[T_B]]) extends T_A[CC_A[T_A[(Int,Char)]]]
case class CC_C(a: (T_A[CC_B],Int)) extends T_A[CC_A[T_A[(Int,Char)]]]
case class CC_D(a: CC_A[CC_C]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_B, b: T_B) extends T_B

val v_a: T_A[CC_A[T_A[(Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A()) => 1 
  case CC_C((CC_A(),_)) => 2 
}
}