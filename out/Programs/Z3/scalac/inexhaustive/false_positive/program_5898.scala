package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: (Int,T_A)) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_A(_, _))) => 0 
}
}
// This is not matched: (CC_B Byte Char Wildcard (CC_A Byte Byte (T_A Byte Byte)) (T_A Char Byte))