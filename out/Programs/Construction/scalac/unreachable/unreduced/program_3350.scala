package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[(Boolean,Boolean), T_A], CC_A], b: T_A, c: (T_A,T_B[CC_A, T_A])) extends T_A
case class CC_C[C](a: T_A, b: CC_A, c: CC_B) extends T_B[C, CC_B]
case class CC_D(a: T_B[T_B[(Int,Boolean), CC_B], CC_B], b: CC_B, c: T_B[CC_A, CC_B]) extends T_B[CC_C[T_B[T_A, Int]], CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), (CC_A(),_)) => 1 
  case CC_B(_, CC_B(_, _, (_,_)), (CC_A(),_)) => 2 
  case CC_B(_, CC_B(_, _, (_,_)), (CC_B(_, _, _),_)) => 3 
}
}
// This is not matched: CC_B(_, CC_A(), (CC_B(_, _, _),_))