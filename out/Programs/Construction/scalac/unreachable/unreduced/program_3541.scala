package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[(Int,Int), Char],T_A[Int, Char]), b: T_A[T_A[Boolean, (Char,Boolean)], Char]) extends T_A[T_A[Boolean, T_A[Int, (Byte,Byte)]], T_A[T_A[Byte, Boolean], Boolean]]
case class CC_B(a: CC_A) extends T_A[T_A[Boolean, T_A[Int, (Byte,Byte)]], T_A[T_A[Byte, Boolean], Boolean]]
case class CC_C() extends T_A[T_A[Boolean, T_A[Int, (Byte,Byte)]], T_A[T_A[Byte, Boolean], Boolean]]

val v_a: T_A[T_A[Boolean, T_A[Int, (Byte,Byte)]], T_A[T_A[Byte, Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_C() => 2 
}
}