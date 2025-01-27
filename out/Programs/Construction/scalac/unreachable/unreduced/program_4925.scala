package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: Char, c: Int) extends T_A[C, T_B]
case class CC_B() extends T_A[T_A[Boolean, T_B], T_B]
case class CC_C(a: T_A[T_B, T_A[CC_B, T_B]], b: CC_B) extends T_A[T_A[Boolean, T_B], T_B]

val v_a: T_A[T_A[Boolean, T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()