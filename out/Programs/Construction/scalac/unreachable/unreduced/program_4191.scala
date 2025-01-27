package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, (Char,Byte)], (Int,Char)]) extends T_A[T_A[T_A[Int, Int], T_A[Boolean, Byte]], ((Char,Boolean),Byte)]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Int, Int], T_A[Boolean, Byte]], ((Char,Boolean),Byte)]
case class CC_C[C]() extends T_A[C, (Char,T_A[CC_A, Byte])]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Boolean, Byte]], ((Char,Boolean),Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}