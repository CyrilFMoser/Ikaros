package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[Boolean, CC_A[Boolean]], b: CC_A[(Byte,Byte)], c: Int) extends T_A[T_A[T_A[Int, Int], T_A[(Char,Byte), Char]], T_A[T_A[T_A[Int, Int], T_A[(Char,Byte), Char]], T_A[T_A[Int, Int], T_A[(Char,Byte), Char]]]]
case class CC_C(a: Byte, b: CC_B) extends T_A[T_A[(Int,CC_B), T_A[(Int,CC_B), (Int,CC_B)]], T_A[T_A[(Int,CC_B), T_A[(Int,CC_B), (Int,CC_B)]], T_A[(Int,CC_B), T_A[(Int,CC_B), (Int,CC_B)]]]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[(Char,Byte), Char]], T_A[T_A[T_A[Int, Int], T_A[(Char,Byte), Char]], T_A[T_A[Int, Int], T_A[(Char,Byte), Char]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}