package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Int, Char]], C]
case class CC_B() extends T_A[T_A[T_A[Byte, Boolean], T_A[Int, Char]], Int]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Int, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}