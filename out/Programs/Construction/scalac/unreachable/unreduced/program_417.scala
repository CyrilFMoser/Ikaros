package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Byte) extends T_A[T_A[(Boolean,Int), Int], C]
case class CC_B(a: (Char,Byte), b: Boolean, c: CC_A[T_A[Int, Int]]) extends T_A[T_A[(Boolean,Int), Int], Byte]
case class CC_C(a: (T_A[CC_B, CC_B],CC_B), b: CC_A[CC_B]) extends T_A[T_A[(Boolean,Int), Int], Byte]

val v_a: T_A[T_A[(Boolean,Int), Int], Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B((_,_), true, _) => 2 
  case CC_B((_,_), false, _) => 3 
  case CC_C((_,_), CC_A(_, _)) => 4 
}
}