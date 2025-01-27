package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: T_B, b: T_B, c: T_B) extends T_A[Byte]
case class CC_C(a: T_B, b: T_A[T_A[CC_A]], c: ((Boolean,T_B),Char)) extends T_A[Byte]
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: CC_C) extends T_B
case class CC_F(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_C(_, _, _)) => 0 
  case CC_F(CC_A()) => 1 
}
}
// This is not matched: CC_D(_)