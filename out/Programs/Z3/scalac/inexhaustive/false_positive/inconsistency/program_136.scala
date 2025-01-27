package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[B]
case class CC_B() extends T_B[T_A]
case class CC_C(a: (CC_B,(Byte,Char)), b: T_B[(Byte,Boolean)]) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,(_,'x')), _) => 1 
}
}
// This is not matched: (CC_D Byte (T_B Byte Byte))