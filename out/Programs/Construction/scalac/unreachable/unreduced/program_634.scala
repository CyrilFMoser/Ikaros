package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Char], T_A[Int, Boolean]]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Char]], T_A[T_A[Char, Boolean], (Byte,Byte)]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Char]], T_A[T_A[Char, Boolean], (Byte,Byte)]]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Char]], T_A[T_A[Char, Boolean], (Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}