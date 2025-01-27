package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Boolean) extends T_A[C, T_A[T_A[Char, Boolean], T_A[Int, (Char,Int)]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Char, Boolean], T_A[Int, (Char,Int)]]]

val v_a: T_A[Byte, T_A[T_A[Char, Boolean], T_A[Int, (Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}