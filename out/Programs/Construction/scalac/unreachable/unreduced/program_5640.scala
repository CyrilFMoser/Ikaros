package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Int, Char], T_A[Boolean, (Char,Int)]]]
case class CC_B(a: T_A[T_A[Boolean, Byte], Char], b: CC_A[CC_A[Int]]) extends T_A[T_A[T_A[Boolean, Char], T_A[Byte, Char]], T_A[T_A[Int, Char], T_A[Boolean, (Char,Int)]]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Byte, Char]], T_A[T_A[Int, Char], T_A[Boolean, (Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}