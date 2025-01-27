package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char) extends T_A[(((Byte,Char),Byte),(Boolean,Byte)), C]
case class CC_B[D]() extends T_A[(((Byte,Char),Byte),(Boolean,Byte)), D]

val v_a: T_A[(((Byte,Char),Byte),(Boolean,Byte)), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}