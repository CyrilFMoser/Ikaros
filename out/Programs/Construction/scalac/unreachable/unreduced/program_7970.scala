package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], T_A[Int, Char]], b: T_A[Int, T_A[Int, Byte]]) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Int]], T_A[(Byte,Char), T_A[Char, Int]]]
case class CC_B(a: Boolean, b: CC_A) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Int]], T_A[(Byte,Char), T_A[Char, Int]]]
case class CC_C() extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Int]], T_A[(Byte,Char), T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Char, Int]], T_A[(Byte,Char), T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)