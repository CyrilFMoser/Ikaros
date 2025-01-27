package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, (Boolean,Byte)], (Byte,Byte)], b: T_A[T_A[Int, Boolean], T_A[Boolean, Char]]) extends T_A[T_A[T_A[Byte, Char], T_A[Boolean, Char]], T_A[T_A[Int, Char], (Boolean,Int)]]
case class CC_B() extends T_A[T_A[T_A[Byte, Char], T_A[Boolean, Char]], T_A[T_A[Int, Char], (Boolean,Int)]]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Boolean, Char]], T_A[T_A[Int, Char], (Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}