package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_A), b: T_A, c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_A, b: T_B[T_B[CC_A]]) extends T_A
case class CC_D(a: T_A, b: (Boolean,CC_A)) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(CC_A(_, _, _))) => 1 
  case CC_A(_, _, CC_C(CC_A(_, _, _), _)) => 2 
  case CC_B(CC_A(_, _, _)) => 3 
}
}
// This is not matched: CC_C(_, _)