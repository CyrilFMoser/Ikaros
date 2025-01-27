package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, (Boolean,Byte)], T_A[Byte, Int]], b: T_A[T_A[Int, Int], Byte]) extends T_A[T_A[T_A[Char, (Int,Int)], T_A[Int, Boolean]], T_A[T_A[Int, Byte], T_A[Byte, Char]]]
case class CC_B() extends T_A[T_A[T_A[Char, (Int,Int)], T_A[Int, Boolean]], T_A[T_A[Int, Byte], T_A[Byte, Char]]]

val v_a: T_A[T_A[T_A[Char, (Int,Int)], T_A[Int, Boolean]], T_A[T_A[Int, Byte], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}