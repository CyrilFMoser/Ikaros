package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Char, Int],T_A[Byte, Char]), b: Int, c: T_A[T_A[Byte, Int], T_A[Boolean, Boolean]]) extends T_A[T_A[Int, Boolean], T_A[T_A[(Int,Char), Char], T_A[(Char,Boolean), Int]]]
case class CC_B(a: Char) extends T_A[T_A[Int, Boolean], T_A[T_A[(Int,Char), Char], T_A[(Char,Boolean), Int]]]

val v_a: T_A[T_A[Int, Boolean], T_A[T_A[(Int,Char), Char], T_A[(Char,Boolean), Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}