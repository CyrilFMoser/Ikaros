package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Byte],T_A[Boolean, Boolean]), b: (Int,Char), c: C) extends T_A[C, (T_A[Byte, Int],Char)]
case class CC_B[D, E]() extends T_A[D, (T_A[Byte, Int],Char)]

val v_a: T_A[Boolean, (T_A[Byte, Int],Char)] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B() => 1 
}
}