package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Int,Byte), T_A[Boolean, (Byte,Boolean)]], b: T_A[T_A[(Char,Int), Byte], T_A[Int, (Boolean,Byte)]], c: T_A[T_A[Char, (Char,Int)], Boolean]) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Int]], T_A[T_A[Int, Int], T_A[Int, (Int,Int)]]]
case class CC_B(a: ((CC_A,CC_A),CC_A), b: (Byte,(CC_A,CC_A)), c: T_A[T_A[CC_A, CC_A], CC_A]) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Int]], T_A[T_A[Int, Int], T_A[Int, (Int,Int)]]]
case class CC_C(a: CC_B, b: CC_B, c: CC_B) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Int]], T_A[T_A[Int, Int], T_A[Int, (Int,Int)]]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Byte, Int]], T_A[T_A[Int, Int], T_A[Int, (Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, (_,_), _)