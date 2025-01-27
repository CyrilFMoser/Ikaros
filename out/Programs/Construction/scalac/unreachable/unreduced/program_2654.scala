package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Byte, T_A[Char, Int]], T_A[T_A[(Int,Byte), (Int,Boolean)], T_A[Int, Byte]]]
case class CC_B(a: Boolean, b: T_A[CC_A, T_A[CC_A, CC_A]]) extends T_A[T_A[Byte, T_A[Char, Int]], T_A[T_A[(Int,Byte), (Int,Boolean)], T_A[Int, Byte]]]

val v_a: T_A[T_A[Byte, T_A[Char, Int]], T_A[T_A[(Int,Byte), (Int,Boolean)], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}