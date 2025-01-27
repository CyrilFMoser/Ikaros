package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, (Char,Int)], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Int, Boolean]], C]
case class CC_B(a: T_A[CC_A[Byte], T_A[(Boolean,Byte), Boolean]], b: T_A[T_A[(Byte,Int), Byte], CC_A[(Int,Int)]], c: CC_A[CC_A[Boolean]]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Int, Boolean]], T_A[CC_A[Boolean], CC_A[Int]]]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Int, Boolean]], T_A[CC_A[Boolean], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}