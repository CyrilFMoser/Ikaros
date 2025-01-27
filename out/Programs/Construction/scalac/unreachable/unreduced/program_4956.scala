package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Char,Boolean), Byte], T_A[Char, Char]]) extends T_A[Boolean, T_A[T_A[Char, Byte], T_A[(Char,Byte), Boolean]]]
case class CC_B(a: (Byte,CC_A)) extends T_A[Boolean, T_A[T_A[Char, Byte], T_A[(Char,Byte), Boolean]]]
case class CC_C(a: CC_B) extends T_A[Boolean, T_A[T_A[Char, Byte], T_A[(Char,Byte), Boolean]]]

val v_a: T_A[Boolean, T_A[T_A[Char, Byte], T_A[(Char,Byte), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,CC_A(_))) => 1 
  case CC_C(_) => 2 
}
}