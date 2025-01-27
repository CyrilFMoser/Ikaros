package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Char], T_A[(Boolean,Boolean), Int]], b: T_A[(Byte,Int), (Int,Byte)]) extends T_A[T_A[T_A[Int, Byte], Char], Int]
case class CC_B[C](a: C) extends T_A[T_A[T_A[Int, Byte], Char], Int]
case class CC_C[D]() extends T_A[T_A[T_A[Int, Byte], Char], Int]

val v_a: T_A[T_A[T_A[Int, Byte], Char], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}