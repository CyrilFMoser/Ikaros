package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Int,Int), Byte], T_A[Boolean, Byte]], b: T_A[Byte, T_A[Boolean, Boolean]], c: Char) extends T_A[T_A[Byte, T_A[(Int,Byte), Int]], T_A[T_A[Byte, Byte], (Byte,Byte)]]
case class CC_B(a: Byte) extends T_A[T_A[Byte, T_A[(Int,Byte), Int]], T_A[T_A[Byte, Byte], (Byte,Byte)]]
case class CC_C(a: T_A[CC_A, CC_B], b: CC_A) extends T_A[T_A[Byte, T_A[(Int,Byte), Int]], T_A[T_A[Byte, Byte], (Byte,Byte)]]

val v_a: T_A[T_A[Byte, T_A[(Int,Byte), Int]], T_A[T_A[Byte, Byte], (Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, CC_A(_, _, _))