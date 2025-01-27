package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[(Byte,Int), Boolean],T_A[(Byte,Int), (Byte,Byte)]), b: T_A[(Int,Byte), T_A[Int, Char]]) extends T_A[Byte, T_A[T_A[Byte, Boolean], ((Byte,Boolean),(Char,Int))]]
case class CC_B(a: T_A[CC_A, CC_A]) extends T_A[Byte, T_A[T_A[Byte, Boolean], ((Byte,Boolean),(Char,Int))]]
case class CC_C[C]() extends T_A[Byte, T_A[T_A[Byte, Boolean], ((Byte,Boolean),(Char,Int))]]

val v_a: T_A[Byte, T_A[T_A[Byte, Boolean], ((Byte,Boolean),(Char,Int))]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}