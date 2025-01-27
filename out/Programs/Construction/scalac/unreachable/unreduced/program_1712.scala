package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Boolean, Boolean], Boolean], b: T_A[T_B[Char, Byte], T_B[Boolean, Boolean]], c: T_B[T_A[Int, Char], T_A[Int, Byte]]) extends T_A[T_A[T_B[Int, Int], T_A[Byte, Boolean]], T_B[T_A[Byte, Byte], (Int,Int)]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], T_A[CC_A, CC_A]], b: CC_A) extends T_A[T_A[T_B[Int, Int], T_A[Byte, Boolean]], T_B[T_A[Byte, Byte], (Int,Int)]]
case class CC_C(a: Boolean, b: (T_A[CC_B, CC_A],CC_A), c: CC_A) extends T_A[T_A[T_B[Int, Int], T_A[Byte, Boolean]], T_B[T_A[Byte, Byte], (Int,Int)]]

val v_a: T_A[T_A[T_B[Int, Int], T_A[Byte, Boolean]], T_B[T_A[Byte, Byte], (Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}