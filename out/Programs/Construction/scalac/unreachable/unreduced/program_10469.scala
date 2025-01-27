package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[((Boolean,Int),(Int,Char)), T_A[(Byte,Boolean)]], b: T_B[Int, T_B[Char, Byte]], c: T_A[T_A[Byte]]) extends T_A[T_B[Byte, T_A[Char]]]
case class CC_B(a: T_B[T_A[CC_A], T_B[CC_A, CC_A]], b: Byte) extends T_A[T_B[Byte, T_A[Char]]]
case class CC_C(a: CC_B, b: T_A[CC_A]) extends T_A[CC_A]

val v_a: T_A[T_B[Byte, T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}