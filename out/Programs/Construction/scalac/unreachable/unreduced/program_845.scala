package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (Byte,(Byte,Boolean)), b: T_B[T_B[Byte, Boolean], Byte], c: T_B[T_A[Byte], T_B[Byte, Int]]) extends T_A[T_B[T_A[(Char,Boolean)], T_B[Byte, Boolean]]]
case class CC_B(a: T_B[Byte, T_B[Int, CC_A]], b: T_A[T_B[CC_A, CC_A]], c: T_B[T_B[(Char,Boolean), CC_A], T_B[Char, (Byte,Char)]]) extends T_A[T_B[T_A[(Char,Boolean)], T_B[Byte, Boolean]]]

val v_a: T_A[T_B[T_A[(Char,Boolean)], T_B[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}