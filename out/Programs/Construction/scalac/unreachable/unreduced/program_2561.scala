package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char) extends T_A[T_A[T_A[Boolean, Byte], T_A[Int, (Boolean,Int)]], C]
case class CC_B[D](a: CC_A[D]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Int, (Boolean,Int)]], D]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Int, (Boolean,Int)]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}