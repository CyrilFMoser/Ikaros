package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Char], T_A[Char, Int]], b: T_A[T_A[(Byte,Int), Char], T_A[Boolean, Int]]) extends T_A[T_A[T_A[Boolean, Byte], T_A[(Boolean,Int), Char]], T_A[(Int,Boolean), T_A[Boolean, Char]]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Byte], T_A[(Boolean,Int), Char]], T_A[(Int,Boolean), T_A[Boolean, Char]]]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[(Boolean,Int), Char]], T_A[(Int,Boolean), T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}