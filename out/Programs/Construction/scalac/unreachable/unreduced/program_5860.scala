package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Int]]) extends T_A[T_B[((Char,Char),Byte), (Boolean,Byte)]]
case class CC_B() extends T_A[T_B[((Char,Char),Byte), (Boolean,Byte)]]
case class CC_C() extends T_A[T_B[((Char,Char),Byte), (Boolean,Byte)]]

val v_a: T_A[T_B[((Char,Char),Byte), (Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()