package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Char, C]
case class CC_B() extends T_B
case class CC_C(a: Byte, b: (Int,T_A[(Byte,Char), (Boolean,Byte)]), c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, (_,_), CC_B()) => 1 
}
}