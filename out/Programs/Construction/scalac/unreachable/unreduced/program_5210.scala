package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[(Boolean,Int), Int], T_A[Int, Char]], T_A[T_A[Int, Char], (Byte,Char)]]
case class CC_B(a: T_A[CC_A[Char], CC_A[Boolean]]) extends T_A[T_A[T_A[(Boolean,Int), Int], T_A[Int, Char]], T_A[T_A[Int, Char], (Byte,Char)]]
case class CC_C(a: T_A[T_A[CC_B, CC_B], Byte], b: CC_B) extends T_A[T_A[T_A[(Boolean,Int), Int], T_A[Int, Char]], T_A[T_A[Int, Char], (Byte,Char)]]

val v_a: T_A[T_A[T_A[(Boolean,Int), Int], T_A[Int, Char]], T_A[T_A[Int, Char], (Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_B(_)) => 2 
}
}