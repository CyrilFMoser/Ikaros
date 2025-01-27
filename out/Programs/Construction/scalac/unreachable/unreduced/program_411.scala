package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C() extends T_B[((T_A,Byte),CC_A), CC_B]
case class CC_D(a: ((CC_C,CC_C),T_B[Int, (Byte,Char)])) extends T_B[((T_A,Byte),CC_A), CC_B]

val v_a: T_B[((T_A,Byte),CC_A), CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D((_,_)) => 1 
}
}