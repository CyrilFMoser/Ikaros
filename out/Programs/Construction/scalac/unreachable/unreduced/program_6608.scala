package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_A[T_B[Int, (Boolean,Boolean)]], c: Char) extends T_A[T_A[T_B[Int, (Char,Int)]]]
case class CC_B(a: (T_A[CC_A],Byte), b: CC_A, c: CC_A) extends T_A[T_A[T_B[Int, (Char,Int)]]]
case class CC_C[D, E](a: T_B[D, D], b: D, c: T_B[D, D]) extends T_B[E, D]

val v_a: T_A[T_A[T_B[Int, (Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}