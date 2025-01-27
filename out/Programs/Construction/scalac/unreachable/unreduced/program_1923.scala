package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, (Int,Byte)], b: T_A[(Int,Byte), T_A[(Char,Int), Int]]) extends T_A[T_A[T_A[Int, Int], T_A[Boolean, Int]], T_A[T_A[Char, Byte], (Boolean,Byte)]]
case class CC_B() extends T_A[T_A[T_A[Int, Int], T_A[Boolean, Int]], T_A[T_A[Char, Byte], (Boolean,Byte)]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Boolean, Int]], T_A[T_A[Char, Byte], (Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}