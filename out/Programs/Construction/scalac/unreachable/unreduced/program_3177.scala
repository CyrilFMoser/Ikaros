package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], C]
case class CC_B(a: CC_A[CC_A[Byte]], b: T_B, c: Int) extends T_B
case class CC_C(a: Boolean, b: T_A[Char, CC_A[CC_B]], c: T_A[(T_B,T_B), T_A[T_B, (Boolean,Boolean)]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_B(_, _, _), _) => 0 
  case CC_B(CC_A(), CC_C(_, _, _), _) => 1 
  case CC_C(_, _, _) => 2 
}
}