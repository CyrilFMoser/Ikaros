package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[((Byte,Byte),Char)]
case class CC_B(a: (T_A[CC_A],CC_A), b: T_A[T_A[CC_A]]) extends T_A[((Byte,Byte),Char)]

val v_a: T_A[((Byte,Byte),Char)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,CC_A(_)), _) => 1 
}
}