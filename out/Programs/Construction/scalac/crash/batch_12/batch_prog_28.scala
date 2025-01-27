package Program_28 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: (T_B,T_A)) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C(a: T_A, b: Boolean, c: CC_A) extends T_B
case class CC_D(a: Char, b: Byte, c: CC_A) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_C(_, _, _),CC_A(_))) => 0 
  case CC_A((CC_C(_, _, _),CC_B(_))) => 1 
  case CC_A((CC_D(_, _, _),CC_A(_))) => 2 
  case CC_A((CC_D(_, _, _),CC_B(_))) => 3 
  case CC_B(_) => 4 
}
}