package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[Int, Boolean]]
case class CC_B() extends T_A[CC_A[(Boolean,Char)], T_A[Int, Boolean]]

val v_a: T_A[T_A[CC_A[(Boolean,Char)], T_A[Int, Boolean]], T_A[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_B T_A)