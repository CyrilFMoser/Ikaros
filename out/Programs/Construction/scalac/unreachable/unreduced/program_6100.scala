package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[(Byte,Char), (Byte,Char)],T_A[Byte, Int]), b: T_A[T_A[Boolean, Boolean], (Char,Int)]) extends T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Int]], Int]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Int]], Int]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(true) => 1 
  case CC_B(false) => 2 
}
}