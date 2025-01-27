package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, T_A[Byte, Byte]], b: T_A[T_A[Boolean, Byte], Boolean]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Char, Byte]], T_A[T_A[Int, Byte], ((Boolean,Char),Boolean)]]
case class CC_B(a: Byte) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Char, Byte]], T_A[T_A[Int, Byte], ((Boolean,Char),Boolean)]]
case class CC_C() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Char, Byte]], T_A[T_A[Int, Byte], ((Boolean,Char),Boolean)]]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Char, Byte]], T_A[T_A[Int, Byte], ((Boolean,Char),Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}