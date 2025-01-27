package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C() extends T_A[T_A[CC_A[(Boolean,Char)]]]
case class CC_D() extends T_B[CC_C]
case class CC_E(a: T_A[CC_C], b: T_B[CC_D]) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(), _) => 1 
}
}
// This is not matched: CC_B(CC_B(CC_A(), _, CC_A()), _, _)