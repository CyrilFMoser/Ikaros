package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Char], (Char,Int)], b: Boolean) extends T_A[T_A[T_A[Byte, Byte], (Char,Int)], Byte]
case class CC_B() extends T_A[T_A[T_A[Byte, Byte], (Char,Int)], Byte]
case class CC_C(a: (Int,Byte)) extends T_A[T_A[T_A[Byte, Byte], (Char,Int)], Byte]

val v_a: T_A[T_A[T_A[Byte, Byte], (Char,Int)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C((12,_)) => 2 
}
}
// This is not matched: CC_C((_,_))