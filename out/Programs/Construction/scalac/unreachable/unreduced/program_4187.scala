package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[(Byte,Int), Int],T_A[Int, Char])) extends T_A[T_A[T_A[Char, Int], (Int,Char)], T_A[T_A[Byte, Char], Byte]]
case class CC_B() extends T_A[T_A[T_A[Char, Int], (Int,Char)], T_A[T_A[Byte, Char], Byte]]

val v_a: T_A[T_A[T_A[Char, Int], (Int,Char)], T_A[T_A[Byte, Char], Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
}
}