package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[T_B]], b: (T_A[CC_A],Byte)) extends T_A[T_A[T_B]]
case class CC_C() extends T_A[T_A[T_B]]
case class CC_D() extends T_B
case class CC_E[B](a: CC_C, b: B, c: CC_B) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (_,_)) => 1 
  case CC_B(CC_B(_, (_,_)), (_,_)) => 2 
  case CC_B(CC_C(), (_,_)) => 3 
}
}
// This is not matched: CC_C()