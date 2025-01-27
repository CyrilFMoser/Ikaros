package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Char], T_A[(Char,Char)]], b: T_B[(Int,Byte), T_B[Char, Byte]]) extends T_A[T_A[T_B[Char, Char]]]
case class CC_B(a: T_A[T_B[CC_A, CC_A]]) extends T_A[T_A[T_B[Char, Char]]]
case class CC_C(a: (CC_A,Char), b: CC_A) extends T_A[CC_B]

val v_a: T_A[T_A[T_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}