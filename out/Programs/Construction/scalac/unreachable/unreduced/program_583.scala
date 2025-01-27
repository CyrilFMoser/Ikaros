package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, Byte], b: Char) extends T_A[Boolean, T_A[T_A[Byte, Boolean], T_A[Int, (Char,Byte)]]]
case class CC_B[C]() extends T_A[Boolean, T_A[T_A[Byte, Boolean], T_A[Int, (Char,Byte)]]]
case class CC_C() extends T_A[Boolean, T_A[T_A[Byte, Boolean], T_A[Int, (Char,Byte)]]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Boolean], T_A[Int, (Char,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()