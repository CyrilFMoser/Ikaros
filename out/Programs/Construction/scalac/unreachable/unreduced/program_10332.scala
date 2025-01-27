package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, (Int,Int)], T_A[Int, Boolean]]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, (Byte,Byte)]], T_A[T_A[Int, Int], Char]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, (Byte,Byte)]], T_A[T_A[Int, Int], Char]]
case class CC_C() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, (Byte,Byte)]], T_A[T_A[Int, Int], Char]]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, (Byte,Byte)]], T_A[T_A[Int, Int], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}