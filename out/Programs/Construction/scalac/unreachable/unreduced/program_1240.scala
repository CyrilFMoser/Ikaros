package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[Boolean, Int]]
case class CC_B(a: CC_A[T_B[Byte, Int]], b: T_A[CC_A[Char], T_A[Char, Boolean]]) extends T_B[CC_A[CC_A[Int]], T_A[CC_A[(Byte,Int)], (Byte,Byte)]]
case class CC_C[F](a: (T_A[Byte, CC_B],T_A[(Byte,Int), CC_B]), b: Boolean, c: F) extends T_B[CC_A[CC_A[Int]], T_A[CC_A[(Byte,Int)], (Byte,Byte)]]

val v_a: T_B[CC_A[CC_A[Int]], T_A[CC_A[(Byte,Int)], (Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, true, _) => 1 
  case CC_C(_, false, _) => 2 
}
}