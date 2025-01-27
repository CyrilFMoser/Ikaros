package Program_57 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[(Boolean,Byte)]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(CC_A(_, _), _), _) => 1 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard Wildcard (T_A T_B)) Wildcard Wildcard (T_A T_B))