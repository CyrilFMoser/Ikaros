package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean, b: T_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]], c: T_A[T_A[Byte, Byte], T_A[Int, Int]]) extends T_A[T_A[T_A[Boolean, Byte], Boolean], T_A[T_A[Boolean, Char], T_A[Char, Boolean]]]
case class CC_B(a: Boolean, b: T_A[Boolean, T_A[CC_A, (Int,Char)]], c: Boolean) extends T_A[T_A[T_A[Boolean, Byte], Boolean], T_A[T_A[Boolean, Char], T_A[Char, Boolean]]]
case class CC_C() extends T_A[T_A[T_A[Boolean, Byte], Boolean], T_A[T_A[Boolean, Char], T_A[Char, Boolean]]]

val v_a: T_A[T_A[T_A[Boolean, Byte], Boolean], T_A[T_A[Boolean, Char], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}