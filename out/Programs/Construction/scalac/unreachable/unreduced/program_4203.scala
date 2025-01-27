package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: ((T_A,T_A),((Byte,Int),T_A)), b: T_B[CC_A]) extends T_A
case class CC_C[B](a: CC_B) extends T_A
case class CC_D(a: T_A) extends T_B[(CC_A,CC_C[CC_B])]

val v_a: T_B[(CC_A,CC_C[CC_B])] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_A(_))) => 0 
  case CC_D(CC_A(CC_B(_, _))) => 1 
  case CC_D(CC_A(CC_C(_))) => 2 
  case CC_D(CC_B(_, _)) => 3 
  case CC_D(CC_C(CC_B(_, _))) => 4 
}
}