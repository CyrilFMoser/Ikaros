package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Char], T_A[Int, Char]]) extends T_A[T_A[T_A[Char, Byte], T_A[(Byte,Byte), Char]], T_A[Boolean, T_A[Char, Char]]]
case class CC_B(a: CC_A, b: CC_A, c: Boolean) extends T_A[T_A[T_A[Char, Byte], T_A[(Byte,Byte), Char]], T_A[Boolean, T_A[Char, Char]]]
case class CC_C() extends T_A[T_A[T_A[Char, Byte], T_A[(Byte,Byte), Char]], T_A[Boolean, T_A[Char, Char]]]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[(Byte,Byte), Char]], T_A[Boolean, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}