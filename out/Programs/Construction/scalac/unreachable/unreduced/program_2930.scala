package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Boolean], T_A[(Boolean,Byte), Byte]]) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Char]], T_A[Boolean, (Char,Char)]]
case class CC_B() extends T_A[T_A[T_A[Int, Int], T_A[Byte, Char]], T_A[Boolean, (Char,Char)]]
case class CC_C(a: Boolean) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Char]], T_A[Boolean, (Char,Char)]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Byte, Char]], T_A[Boolean, (Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}