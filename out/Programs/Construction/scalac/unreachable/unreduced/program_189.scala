package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B[B]() extends T_A[T_B]
case class CC_C() extends T_B
case class CC_D(a: (T_A[Int],T_A[CC_C]), b: CC_B[CC_A], c: T_A[T_B]) extends T_B
case class CC_E(a: CC_C, b: T_A[T_B], c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D((_,_), _, CC_A()) => 1 
  case CC_D((_,_), _, CC_B()) => 2 
  case CC_E(CC_C(), CC_A(), CC_A()) => 3 
}
}
// This is not matched: CC_E(CC_C(), CC_B(), CC_A())