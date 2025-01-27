package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_B[Boolean, Byte], T_B[Byte, Byte]], b: T_A[T_B[Char, Byte], (Int,Boolean)], c: T_B[T_A[Char, Int], T_B[Byte, Byte]]) extends T_A[T_A[T_B[Char, Char], Boolean], T_A[T_A[Int, Boolean], T_B[Char, Byte]]]
case class CC_B(a: T_A[(CC_A,Boolean), Int], b: T_A[CC_A, CC_A]) extends T_A[T_A[T_B[Char, Char], Boolean], T_A[T_A[Int, Boolean], T_B[Char, Byte]]]
case class CC_C() extends T_A[T_A[T_B[Char, Char], Boolean], T_A[T_A[Int, Boolean], T_B[Char, Byte]]]
case class CC_D(a: CC_A, b: T_B[T_B[CC_C, Boolean], (CC_C,CC_C)], c: T_B[CC_A, Boolean]) extends T_B[CC_A, Boolean]

val v_a: T_A[T_A[T_B[Char, Char], Boolean], T_A[T_A[Int, Boolean], T_B[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)