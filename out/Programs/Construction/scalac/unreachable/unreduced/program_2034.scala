package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(Boolean,((Char,Int),Byte))]
case class CC_B(a: CC_A, b: T_A[CC_A], c: Int) extends T_A[(Boolean,((Char,Int),Byte))]

val v_a: T_A[(Boolean,((Char,Int),Byte))] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}