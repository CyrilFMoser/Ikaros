package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, Byte], b: Int) extends T_A[T_A[Int, (Byte,Int)], T_A[(Boolean,Int), Boolean]]

val v_a: T_A[T_A[Int, (Byte,Int)], T_A[(Boolean,Int), Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A (Tuple Char Byte))))