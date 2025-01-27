package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Boolean,Char), Char], Byte], b: T_A[T_A[Int, Byte], (Int,(Byte,Boolean))]) extends T_A[T_A[T_A[Char, Boolean], (Int,Boolean)], T_A[(Int,Byte), T_A[Boolean, (Int,Byte)]]]
case class CC_B(a: (Int,CC_A), b: CC_A, c: Byte) extends T_A[T_A[T_A[Char, Boolean], (Int,Boolean)], T_A[(Int,Byte), T_A[Boolean, (Int,Byte)]]]

val v_a: T_A[T_A[T_A[Char, Boolean], (Int,Boolean)], T_A[(Int,Byte), T_A[Boolean, (Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}