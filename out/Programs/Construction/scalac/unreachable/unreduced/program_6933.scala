package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Char], T_A[Boolean, Boolean]], b: T_A[T_A[Char, Char], T_A[Boolean, Byte]]) extends T_A[(T_A[Int, Boolean],Char), T_A[T_A[Boolean, Int], T_A[Int, (Char,Int)]]]
case class CC_B() extends T_A[(T_A[Int, Boolean],Char), T_A[T_A[Boolean, Int], T_A[Int, (Char,Int)]]]
case class CC_C(a: Char, b: CC_B) extends T_A[(T_A[Int, Boolean],Char), T_A[T_A[Boolean, Int], T_A[Int, (Char,Int)]]]

val v_a: T_A[(T_A[Int, Boolean],Char), T_A[T_A[Boolean, Int], T_A[Int, (Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()