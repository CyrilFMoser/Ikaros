package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, ((Int,Boolean),(Boolean,Char))]) extends T_A[((Int,Byte),Byte), T_A[Boolean, (Char,Byte)]]
case class CC_B(a: (CC_A,Char), b: (Boolean,CC_A)) extends T_A[((Int,Byte),Byte), T_A[Boolean, (Char,Byte)]]

val v_a: T_A[((Int,Byte),Byte), T_A[Boolean, (Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}