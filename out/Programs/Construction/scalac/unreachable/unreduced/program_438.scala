package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_B, C]
case class CC_B() extends T_A[T_B, T_A[T_B, Boolean]]
case class CC_C(a: (T_A[T_B, CC_B],T_B), b: CC_B) extends T_A[T_B, T_A[T_B, Boolean]]

val v_a: T_A[T_B, T_A[T_B, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()