package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B, c: T_B) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], C]
case class CC_B() extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], (T_B,T_B)]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], (T_B,T_B)]
case class CC_D(a: CC_B, b: T_B, c: T_A[CC_A[CC_C], ((Boolean,Int),T_B)]) extends T_B
case class CC_E() extends T_B
case class CC_F[D](a: D, b: Boolean, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, _, _), _) => 0 
  case CC_D(_, CC_E(), _) => 1 
  case CC_D(_, CC_F(_, _, _), _) => 2 
  case CC_E() => 3 
  case CC_F(_, _, _) => 4 
}
}