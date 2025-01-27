package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: T_B[T_B[(Boolean,Byte)]], c: Byte) extends T_A
case class CC_D(a: CC_B, b: CC_B) extends T_B[CC_B]
case class CC_E(a: T_A) extends T_B[(T_A,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, CC_A(_, _)), _, _) => 2 
  case CC_C(CC_A(_, CC_B()), _, _) => 3 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, _) => 4 
}
}