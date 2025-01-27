package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Int],T_A[Boolean, (Char,Int)])) extends T_A[C, (T_A[Char, Boolean],T_A[Char, Byte])]
case class CC_B[D]() extends T_A[D, (T_A[Char, Boolean],T_A[Char, Byte])]

val v_a: T_A[Int, (T_A[Char, Boolean],T_A[Char, Byte])] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
}
}