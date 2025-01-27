package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_A[T_B]], c: T_A[T_B]) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: Char, b: (T_A[CC_A],(CC_A,Char))) extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: T_A[Boolean], b: T_A[Byte]) extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E() => 1 
  case CC_F() => 2 
}
}