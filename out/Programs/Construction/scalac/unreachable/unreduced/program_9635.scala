package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char) extends T_A[C, T_A[T_A[Int, Byte], T_A[Int, (Boolean,Int)]]]
case class CC_B[D](a: D) extends T_A[D, T_A[T_A[Int, Byte], T_A[Int, (Boolean,Int)]]]

val v_a: T_A[Int, T_A[T_A[Int, Byte], T_A[Int, (Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
}
}