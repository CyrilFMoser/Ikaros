package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Boolean], T_A[Boolean, Char]], b: Boolean) extends T_A[T_A[T_A[Byte, Byte], T_A[Boolean, Int]], ((Char,Int),T_A[Int, (Boolean,Char)])]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Byte, Byte], T_A[Boolean, Int]], ((Char,Int),T_A[Int, (Boolean,Char)])]
case class CC_C(a: CC_A, b: T_A[Int, (CC_A,CC_A)]) extends T_A[T_A[T_A[Byte, Byte], T_A[Boolean, Int]], ((Char,Int),T_A[Int, (Boolean,Char)])]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[Boolean, Int]], ((Char,Int),T_A[Int, (Boolean,Char)])] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _)