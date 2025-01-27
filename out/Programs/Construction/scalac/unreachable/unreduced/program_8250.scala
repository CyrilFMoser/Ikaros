package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[((Byte,Byte),T_A[Boolean])]
case class CC_B(a: CC_A) extends T_A[((Byte,Byte),T_A[Boolean])]
case class CC_C(a: T_A[Byte], b: Int, c: Char) extends T_A[((Byte,Byte),T_A[Boolean])]

val v_a: T_A[((Byte,Byte),T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, 'x') => 1 
  case CC_C(_, _, _) => 2 
}
}
// This is not matched: CC_B(CC_A())