package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Int) extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], C]
case class CC_B(a: T_A[CC_A[Byte], (Boolean,Byte)], b: (Char,T_A[Byte, Int])) extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], CC_A[(Byte,Int)]]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], CC_A[(Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _) => 2 
}
}