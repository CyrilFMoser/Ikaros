package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Int, (Byte,Char)], T_A[Int, Char]], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[T_A[Int, (Byte,Char)], T_A[Int, Char]], D]

val v_a: T_A[T_A[T_A[Int, (Byte,Char)], T_A[Int, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}