package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Boolean], T_A[Char]]) extends T_A[T_B[T_B[(Byte,Boolean), Byte], (Int,Int)]]
case class CC_B(a: T_A[T_B[(Char,Boolean), Boolean]], b: T_A[T_A[CC_A]], c: Byte) extends T_A[T_B[T_B[(Byte,Boolean), Byte], (Int,Int)]]

val v_a: T_A[T_B[T_B[(Byte,Boolean), Byte], (Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, 0) => 1 
  case CC_B(_, _, _) => 2 
}
}