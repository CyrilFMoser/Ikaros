package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Byte], T_A[Char, (Byte,Boolean)]], b: T_A[(Boolean,Int), T_A[(Byte,Char), (Byte,Int)]]) extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Int]], T_A[(Int,Boolean), (Int,(Byte,Boolean))]]
case class CC_B() extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Int]], T_A[(Int,Boolean), (Int,(Byte,Boolean))]]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Int, Int]], T_A[(Int,Boolean), (Int,(Byte,Boolean))]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}