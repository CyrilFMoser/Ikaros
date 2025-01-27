package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[T_A[Boolean, Byte], (Int,Int)], C]
case class CC_B() extends T_A[T_A[T_A[Boolean, Byte], (Int,Int)], CC_A[((Int,Char),Int)]]
case class CC_C[D, E](a: CC_A[E]) extends T_A[T_A[T_A[Boolean, Byte], (Int,Int)], D]

val v_a: T_A[T_A[T_A[Boolean, Byte], (Int,Int)], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}