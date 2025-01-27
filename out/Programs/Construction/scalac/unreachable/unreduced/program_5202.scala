package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, T_A], T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: (CC_B,T_B[CC_B, (Byte,Int)]), c: (T_A,Int)) extends T_B[((CC_A,CC_A),T_B[(Boolean,Int), Char]), T_A]
case class CC_D() extends T_B[((CC_A,CC_A),T_B[(Boolean,Int), Char]), T_A]
case class CC_E(a: T_B[T_A, CC_C], b: CC_B, c: CC_A) extends T_B[((CC_A,CC_A),T_B[(Boolean,Int), Char]), T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_B() => 2 
}
}