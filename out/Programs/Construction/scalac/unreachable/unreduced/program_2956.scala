package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (T_A[Byte, Char],Char)) extends T_A[T_B[T_B[Boolean]], Byte]
case class CC_B(a: T_B[CC_A]) extends T_A[T_B[T_B[Boolean]], Byte]
case class CC_C() extends T_B[T_B[Boolean]]
case class CC_D(a: CC_C, b: CC_B) extends T_B[T_B[Boolean]]
case class CC_E(a: (CC_D,T_B[Int]), b: T_A[CC_D, T_B[CC_D]]) extends T_B[T_B[Boolean]]

val v_a: T_B[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(), _) => 0 
  case CC_E((CC_D(_, _),_), _) => 1 
}
}
// This is not matched: CC_C()