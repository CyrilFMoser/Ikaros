package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Int], T_A[Char, (Int,Char)]], T_A[T_A[Byte, Byte], Byte]]
case class CC_B(a: (T_A[(Int,Byte), CC_A],T_A[CC_A, CC_A])) extends T_A[T_A[T_A[Byte, Int], T_A[Char, (Int,Char)]], T_A[T_A[Byte, Byte], Byte]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Byte, Int], T_A[Char, (Int,Char)]], T_A[T_A[Byte, Byte], Byte]]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Char, (Int,Char)]], T_A[T_A[Byte, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_)) => 1 
  case CC_C(CC_B((_,_))) => 2 
}
}