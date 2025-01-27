package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Byte, c: T_A[C, C]) extends T_A[C, T_A[T_A[Char, Boolean], T_A[Byte, (Int,Byte)]]]
case class CC_B[D](a: T_A[D, D], b: Byte, c: Char) extends T_A[T_A[CC_A[Int], CC_A[Byte]], T_A[T_A[Char, Boolean], T_A[Byte, (Int,Byte)]]]
case class CC_C(a: T_A[((Char,Boolean),Boolean), Boolean]) extends T_A[T_A[CC_A[Int], CC_A[Byte]], T_A[T_A[Char, Boolean], T_A[Byte, (Int,Byte)]]]

val v_a: T_A[T_A[CC_A[Int], CC_A[Byte]], T_A[T_A[Char, Boolean], T_A[Byte, (Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}