package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (((Boolean,Byte),Int),T_A[Int, (Byte,Byte)]), b: (T_A[Byte, Boolean],Int), c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: Byte, b: Int) extends T_A[Boolean, T_A[Boolean, Boolean]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), CC_A(_, _, _)) => 0 
  case CC_A(_, (_,_), CC_B(_, _)) => 1 
  case CC_B(_, _) => 2 
}
}