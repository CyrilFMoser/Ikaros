package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Boolean], T_A[Int, Int]], b: T_A[T_A[Boolean, Int], T_A[Byte, (Byte,Byte)]]) extends T_A[Boolean, T_A[T_A[Byte, Boolean], T_A[Char, Byte]]]
case class CC_B() extends T_A[Boolean, T_A[T_A[Byte, Boolean], T_A[Char, Byte]]]
case class CC_C() extends T_A[Boolean, T_A[T_A[Byte, Boolean], T_A[Char, Byte]]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Boolean], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()