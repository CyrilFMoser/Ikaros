package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[C, C]) extends T_A[T_A[Byte, T_A[(Int,Byte), Byte]], T_A[T_A[Boolean, Char], (Int,Char)]]
case class CC_B(a: T_A[CC_A[(Char,Int)], (Boolean,Char)], b: CC_A[(Int,Char)], c: CC_A[CC_A[Int]]) extends T_A[T_A[Byte, T_A[(Int,Byte), Byte]], T_A[T_A[Boolean, Char], (Int,Char)]]

val v_a: T_A[T_A[Byte, T_A[(Int,Byte), Byte]], T_A[T_A[Boolean, Char], (Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _), CC_A(_, _)) => 1 
}
}