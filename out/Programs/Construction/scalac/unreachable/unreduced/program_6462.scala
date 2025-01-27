package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Boolean], Byte], b: (T_A[Boolean, Boolean],T_A[Byte, Char]), c: T_A[T_A[Int, Boolean], Byte]) extends T_A[Char, T_A[T_A[Char, (Int,Char)], T_A[Int, Int]]]
case class CC_B() extends T_A[Char, T_A[T_A[Char, (Int,Char)], T_A[Int, Int]]]
case class CC_C() extends T_A[Char, T_A[T_A[Char, (Int,Char)], T_A[Int, Int]]]

val v_a: T_A[Char, T_A[T_A[Char, (Int,Char)], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()