package Program_25 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: (T_A,Byte), c: T_A) extends T_A
case class CC_B() extends T_B
case class CC_C(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B()) => 1 
  case CC_C(CC_C(CC_B())) => 2 
  case CC_C(CC_C(CC_C(_))) => 3 
}
}