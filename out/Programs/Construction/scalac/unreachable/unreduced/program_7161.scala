package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Int, Char],(Byte,Byte))) extends T_A[T_A[T_A[Char, Byte], T_A[Byte, Char]], T_A[T_A[(Char,Byte), Boolean], Char]]
case class CC_B(a: CC_A, b: T_A[Char, Byte], c: Boolean) extends T_A[T_A[T_A[Char, Byte], T_A[Byte, Char]], T_A[T_A[(Char,Byte), Boolean], Char]]
case class CC_C() extends T_A[T_A[T_A[Char, Byte], T_A[Byte, Char]], T_A[T_A[(Char,Byte), Boolean], Char]]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[Byte, Char]], T_A[T_A[(Char,Byte), Boolean], Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(CC_A((_,_)), _, _) => 1 
  case CC_C() => 2 
}
}