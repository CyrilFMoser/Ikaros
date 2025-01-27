package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Int, Byte]]) extends T_A[T_A[T_A[Boolean, Boolean], (Char,Boolean)], T_A[Byte, (Int,Char)]]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Boolean, Boolean], (Char,Boolean)], T_A[Byte, (Int,Char)]]
case class CC_C() extends T_B[CC_B]

val v_a: T_A[T_A[T_A[Boolean, Boolean], (Char,Boolean)], T_A[Byte, (Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}