package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[(Boolean,Byte), Char], Byte], (Boolean,T_A[Boolean, Int])]
case class CC_B(a: CC_A, b: T_A[CC_A, T_A[CC_A, (Byte,Char)]], c: Byte) extends T_A[T_A[T_A[(Boolean,Byte), Char], Byte], (Boolean,T_A[Boolean, Int])]

val v_a: T_A[T_A[T_A[(Boolean,Byte), Char], Byte], (Boolean,T_A[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}