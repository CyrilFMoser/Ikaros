package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: CC_A, b: T_A[T_A[T_B]], c: (CC_A,T_A[(Char,Char)])) extends T_A[T_A[T_B]]
case class CC_C() extends T_B
case class CC_D(a: (T_B,T_A[CC_B]), b: CC_A, c: T_A[CC_A]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D((CC_C(),_), _, _) => 1 
}
}
// This is not matched: CC_D((CC_D(_, _, _),_), _, _)