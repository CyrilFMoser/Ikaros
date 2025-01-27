package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C() extends T_B[T_A[Boolean]]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 1 
}
}
// This is not matched: (CC_B T_B (T_A T_B))
// Mutation information: 
// Deleted Pattern CC_A(0, _) at position 2