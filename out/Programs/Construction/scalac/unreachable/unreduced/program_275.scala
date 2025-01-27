package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B]]
case class CC_B(a: CC_A, b: (T_B,T_A[CC_A]), c: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_C(a: CC_A, b: (Int,(Byte,CC_A)), c: T_A[T_B]) extends T_A[T_A[T_B]]
case class CC_D(a: (CC_C,Char)) extends T_B
case class CC_E(a: T_A[Char], b: (CC_B,T_A[CC_C])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,_)) => 0 
  case CC_E(_, _) => 1 
}
}