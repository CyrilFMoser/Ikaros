package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_A) extends T_A
case class CC_B(a: T_B[CC_A, (T_A,T_A)]) extends T_B[T_A, T_B[T_B[CC_A, CC_A], T_A]]
case class CC_C[C]() extends T_B[T_A, T_B[T_B[CC_A, CC_A], T_A]]

val v_a: T_B[T_A, T_B[T_B[CC_A, CC_A], T_A]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}