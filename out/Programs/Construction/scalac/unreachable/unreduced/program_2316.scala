package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_C(a: (T_A[CC_B],((Byte,Boolean),T_B))) extends T_A[T_A[T_B]]
case class CC_D(a: CC_B, b: T_A[T_A[T_B]]) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_B(CC_B(CC_A())) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C(_))) => 4 
  case CC_C((_,(_,_))) => 5 
}
}
// This is not matched: CC_B(CC_C(_))